plugins {
    kotlin("jvm") version "1.5.10"
    id("com.arssycro.gradle")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework:spring-context")
}

uber {
    // If you uncomment the following line, the example test class will no longer compile.
    junit()
    // If you uncomment the following line, the spring-context JAR will not be found due to missing version.
    spring()
}