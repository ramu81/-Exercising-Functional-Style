package edu.chinna.kadira;

interface UseResource {
    void accept(Resource r);
}

class Resource {
    private Resource() {
        System.out.println(" Creating");
    }

    public static void use(UseResource uscResource) {
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

public class ExecuteAroundMethodPattern {
    public static void main(String[] args) {
        Resource.use(new UseResource() {
            @Override
            public void accept(Resource r) {
                r.op1();
            }
        });
    }
}
