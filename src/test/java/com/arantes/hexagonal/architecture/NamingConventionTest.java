package com.arantes.hexagonal.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.arantes.hexagonal")
public class NamingConventionTest {

    @ArchTest
    public static final ArchRule consumer_reside_only_consumer_package = classes()
            .that()
            .haveNameMatching(".*Consumer")
            .should()
            .resideInAPackage("..adapters.in.consumer")
            .as("Consumer classes should reside inside consumer package in adapters.in package");

    @ArchTest
    public static final ArchRule mapper_reside_only_mapper_package = classes()
            .that()
            .haveNameMatching(".*Mapper")
            .should()
            .resideInAnyPackage("..adapters.in.consumer.mapper", "..adapters.in.controller.mapper", "..adapters.out.client.mapper", "..adapters.out.repository.mapper")
            .as("Mapper classes should reside inside mapper package in controller, client, consumer or repository packages");

    @ArchTest
    public static final ArchRule message_reside_only_message_package = classes()
            .that()
            .haveNameMatching(".*Message")
            .should()
            .resideInAPackage("..adapters.in.consumer.message")
            .as("Message classes should reside inside message package in consumer package");

    @ArchTest
    public static final ArchRule controller_reside_only_controller_package = classes()
            .that()
            .haveNameMatching(".*Controller")
            .should()
            .resideInAPackage("..adapters.in.controller")
            .as("Controller classes should reside inside controller package in adapters.in package");

    @ArchTest
    public static final ArchRule request_reside_only_request_package = classes()
            .that()
            .haveNameMatching(".*Request")
            .should()
            .resideInAnyPackage("..adapters.in.controller.request", "..adapters.out.client.request")
            .as("Request classes should reside inside request package in controller or client packages");

    @ArchTest
    public static final ArchRule response_reside_only_response_package = classes()
            .that()
            .haveNameMatching(".*Response")
            .should()
            .resideInAnyPackage("..adapters.in.controller.response", "..adapters.out.client.response")
            .as("Response classes should reside inside response package in controller or client packages");

    @ArchTest
    public static final ArchRule adapter_reside_only_adapter_package = classes()
            .that()
            .haveNameMatching(".*Adapter")
            .should()
            .resideInAPackage("..adapters.out")
            .as("Adapter classes should reside inside out package in adapters package");

    @ArchTest
    public static final ArchRule client_reside_only_client_package = classes()
            .that()
            .haveNameMatching(".*Client")
            .should()
            .resideInAPackage("..adapters.out.client")
            .as("Client classes should reside inside client package in adapters.out package");

    @ArchTest
    public static final ArchRule repository_reside_only_repository_package = classes()
            .that()
            .haveNameMatching(".*Repository")
            .should()
            .resideInAPackage("..adapters.out.repository")
            .as("Repository classes should reside inside repository package in adapters.out package");

    @ArchTest
    public static final ArchRule entity_reside_only_entity_package = classes()
            .that()
            .haveNameMatching(".*Entity")
            .should()
            .resideInAPackage("..adapters.out.repository.entity")
            .as("Entity classes should reside inside entity package in entity package");

    @ArchTest
    public static final ArchRule usecase_reside_only_usecase_package = classes()
            .that()
            .haveNameMatching(".*UseCase")
            .should()
            .resideInAPackage("..application.core.usecase")
            .as("Usecase classes should reside inside usecase package in core package");

    @ArchTest
    public static final ArchRule input_reside_only_input_package = classes()
            .that()
            .haveNameMatching(".*InputPort")
            .should()
            .resideInAPackage("..application.ports.in")
            .as("InputPort classes should reside inside ports.in package in application package");

    @ArchTest
    public static final ArchRule output_reside_only_output_package = classes()
            .that()
            .haveNameMatching(".*OutputPort")
            .should()
            .resideInAPackage("..application.ports.out")
            .as("OutputPort classes should reside inside ports.out package in application package");

    @ArchTest
    public static final ArchRule config_reside_only_config_package = classes()
            .that()
            .haveNameMatching(".*Config")
            .should()
            .resideInAPackage("..hexagonal.config")
            .as("Config classes should reside inside config package in hexagonal package");

    @ArchTest
    public static final ArchRule should_be_suffixed_consumer = classes()
            .that()
            .resideInAPackage("..consumer")
            .should()
            .haveSimpleNameEndingWith("Consumer");

    @ArchTest
    public static final ArchRule should_be_suffixed_mapper = classes()
            .that()
            .resideInAPackage("..mapper")
            .should()
            .haveSimpleNameEndingWith("Mapper")
            .orShould()
            .haveSimpleNameEndingWith("MapperImpl");

    @ArchTest
    public static final ArchRule should_be_suffixed_message = classes()
            .that()
            .resideInAPackage("..message")
            .should()
            .haveSimpleNameEndingWith("Message");

    @ArchTest
    public static final ArchRule should_be_suffixed_controller = classes()
            .that()
            .resideInAPackage("..controller")
            .should()
            .haveSimpleNameEndingWith("Controller");

    @ArchTest
    public static final ArchRule should_be_suffixed_request = classes()
            .that()
            .resideInAPackage("..request")
            .should()
            .haveSimpleNameEndingWith("Request");

    @ArchTest
    public static final ArchRule should_be_suffixed_response = classes()
            .that()
            .resideInAPackage("..response")
            .should()
            .haveSimpleNameEndingWith("Response");

    @ArchTest
    public static final ArchRule should_be_suffixed_client = classes()
            .that()
            .resideInAPackage("..client")
            .should()
            .haveSimpleNameEndingWith("Client");

    @ArchTest
    public static final ArchRule should_be_suffixed_repository = classes()
            .that()
            .resideInAPackage("..repository")
            .should()
            .haveSimpleNameEndingWith("Repository");

    @ArchTest
    public static final ArchRule should_be_suffixed_entity = classes()
            .that()
            .resideInAPackage("..entity")
            .should()
            .haveSimpleNameEndingWith("Entity");

    @ArchTest
    public static final ArchRule should_be_suffixed_adapter = classes()
            .that()
            .resideInAPackage("..adapters.out")
            .should()
            .haveSimpleNameEndingWith("Adapter");

    @ArchTest
    public static final ArchRule should_be_suffixed_usecase = classes()
            .that()
            .resideInAPackage("..usecase")
            .should()
            .haveSimpleNameEndingWith("UseCase");

    @ArchTest
    public static final ArchRule should_be_suffixed_input_port = classes()
            .that()
            .resideInAPackage("..ports.in")
            .should()
            .haveSimpleNameEndingWith("InputPort");

    @ArchTest
    public static final ArchRule should_be_suffixed_output_port = classes()
            .that()
            .resideInAPackage("..ports.out")
            .should()
            .haveSimpleNameEndingWith("OutputPort");

    @ArchTest
    public static final ArchRule should_be_suffixed_config = classes()
            .that()
            .resideInAPackage("..config")
            .should()
            .haveSimpleNameEndingWith("Config");

}
