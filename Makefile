openapi-generator-version:=6.0.1 #OpenAPI生成器的版本。
openapi-generator-url:=https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/$(openapi-generator-version)/openapi-generator-cli-$(openapi-generator-version).jar
openapi-generator-jar:=target/openapi-generator-cli.jar # 生成器 JAR 文件的存放路径。
openapi-generator-cli:=java -jar $(openapi-generator-jar) # 运行生成器的命令。

generator:=java
library:=jersey3 # 定义 Java 生成器和库（这里使用 jersey3）。
modelGen:=consult # 需要生成模型的服务列表。
models:=src/main/java/com/antom/model #生成模型的存放路径。
output:=target/out #生成输出的临时目录。


# Generate models (for each service)
models: $(modelGen)


consult: spec=ConsultRequest-v1


#服务和模型的生成规则
$(modelGen): target/spec $(openapi-generator-jar)
	rm -rf $(models)/$@ $(output)
	$(openapi-generator-cli) generate \
		-i target/spec/json/$(spec).json \
		-g $(generator) \
		-t templates \
		-o $(output) \
		--reserved-words-mappings configuration=configuration \
		--ignore-file-override ./.openapi-generator-ignore \
		--skip-validate-spec \
		--model-package $(subst /,.,com.antom.model) \
		--library $(library) \
		--global-property modelDocs=false \
		--global-property modelTests=false \
		--inline-schema-name-mappings PaymentRequest_paymentMethod=CheckoutPaymentMethod \
		--inline-schema-name-mappings DonationPaymentRequest_paymentMethod=DonationPaymentMethod \
		--additional-properties=dateLibrary=java8 \
		--additional-properties=openApiNullable=false \
		--additional-properties=resourceClass=$(resourceClass)Resource
	mv $(output)/$(models)/$@ $(models)/$@
	mv $(output)/$(models)/JSON.java $(models)/$@

# Full service + models automation
#bigServices:=consult
#singleFileServices:=consult
#
#services: $(bigServices) $(singleFileServices)

#$(bigServices): target/spec $(openapi-generator-jar)
#	rm -rf $(models)/$@ $(output)
#	rm -rf src/main/java/com/antom/request/$@ $(output)
#	$(openapi-generator-cli) generate \
#		-i target/spec/json/$(spec).json \
#		-g $(generator) \
#		-t templates \
#		-o $(output) \
#		--reserved-words-mappings configuration=configuration \
#		--ignore-file-override ./.openapi-generator-ignore \
#		--skip-validate-spec \
#		--model-package $(subst /,.,com.antom.model) \
#		--library $(library) \
#		--api-package com.antom.request.$@ \
#		--api-name-suffix Api \
#		--global-property modelDocs=false \
#		--global-property modelTests=false \
#		--inline-schema-name-mappings PaymentRequest_paymentMethod=CheckoutPaymentMethod \
#		--inline-schema-name-mappings DonationPaymentRequest_paymentMethod=DonationPaymentMethod \
#		--additional-properties=dateLibrary=java8 \
#		--additional-properties=openApiNullable=false
#	mv $(output)/$(models)/$@ $(models)/$@
#	mv $(output)/src/main/java/com/antom/request/JSON.java $(models)/$@
#	mv $(output)/src/main/java/com/antom/request/$@ src/main/java/com/antom/request/$@

$(singleFileServices): target/spec $(openapi-generator-jar)
	jq -e 'del(.paths[][].tags)' target/spec/json/$(spec).json > target/spec/json/$(spec).tmp
	mv target/spec/json/$(spec).tmp target/spec/json/$(spec).json 
	rm -rf $(models)/$@ $(output)
	rm -rf src/main/java/com/antom/service/$@ $(output)
	$(openapi-generator-cli) generate \
		-i target/spec/json/$(spec).json \
		-g $(generator) \
		-c templates/libraries/jersey3/config.yaml \
		-o $(output) \
		--reserved-words-mappings configuration=configuration \
		--ignore-file-override ./.openapi-generator-ignore \
		--skip-validate-spec \
		--model-package $(subst /,.,com.antom.model) \
		--library $(library) \
		--additional-properties customApi=$@ \
		--api-package com.antom.service \
		--api-name-suffix Api \
		--global-property modelDocs=false \
		--global-property modelTests=false \
		--inline-schema-name-mappings PaymentRequest_paymentMethod=CheckoutPaymentMethod \
		--inline-schema-name-mappings DonationPaymentRequest_paymentMethod=DonationPaymentMethod \
		--additional-properties=dateLibrary=java8 \
		--additional-properties=openApiNullable=false \
		--additional-properties=smallServiceName=$(smallServiceName)
	mv $(output)/$(models)/$@ $(models)/$@
	mv $(output)/src/main/java/com/antom/JSON.java $(models)/$@
	mv $(output)/src/main/java/com/antom/service/*Single.java src/main/java/com/antom/service/$(smallServiceName).java


# Checkout spec (and patch version)
target/spec:
	git clone https://github.com/wangzunjiao/antom-openapi.git target/spec
	perl -i -pe's/"openapi" : "3.[0-9].[0-9]"/"openapi" : "3.0.0"/' target/spec/json/*.json


# Extract templates (copy them for modifications)
templates: $(openapi-generator-jar)
	$(openapi-generator-cli) author template -g $(generator) --library $(library) -o target/templates


# Download the generator
$(openapi-generator-jar):
	wget --quiet -o /dev/null $(openapi-generator-url) -O $(openapi-generator-jar)


# Discard generated artifacts and changed models
clean:
	rm -rf $(output)
	git checkout $(models)
	git clean -f -d $(models)


.PHONY: templates models $(services)
