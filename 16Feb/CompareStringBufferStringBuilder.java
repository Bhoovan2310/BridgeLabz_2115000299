public class CompareStringBufferStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String str = "hello";

        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append(str);
        }
        long endBuffer = System.nanoTime();

        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append(str);
        }
        long endBuilder = System.nanoTime();

        System.out.println("StringBuffer: " + (endBuffer - startBuffer) + " ns");
        System.out.println("StringBuilder: " + (endBuilder - startBuilder) + " ns");
    }
}