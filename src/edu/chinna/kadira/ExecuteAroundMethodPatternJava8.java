package edu.chinna.kadira;

import java.util.function.Consumer;

class Resource {
    private Resource() {
        System.out.println(" Creating");
    }

    public static void use(Consumer<Resource> uscResource) {
        Resource resource = new Resource();
        try {
            uscResource.accept(resource);
        } finally {
            resource.close();
        }
    }

    protected void op1() {
        System.out.println(" operation...");
    }

    private void close() {
        System.out.println(" closed...");
    }
}

public class ExecuteAroundMethodPatternJava8 {
    public static void main(String[] args) {
        Resource.use(Resource::op1);
    }
}
