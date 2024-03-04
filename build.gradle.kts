plugins {
    id("java")
}

group = "aoleg.com.github"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.3")
    compileOnly("org.projectlombok:lombok:1.18.30")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}