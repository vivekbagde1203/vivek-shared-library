package com.vbagde.pipeline

class Greeter {
    def steps

    Greeter(steps) {
        this.steps = steps
    }

    def sayHello(String name) {
        steps.echo "Hello from Class: ${name}"
    }
}

