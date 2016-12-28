public class Hello {
    public String greet(String name) {
        return com.google.common.base.MoreObjects.firstNonNull(null, "Hello ") + name;
    }
}

