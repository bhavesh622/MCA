class InvalidProductException extends Exception {
    public InvalidProductException (String s)
    {
        super(s);
    }
}

public class InvalidProductCheck {
    void productCheck(int weight) throws InvalidProductException {
        if (weight < 100) {
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String args[]) {
        InvalidProductCheck obj = new InvalidProductCheck();
        try {
            System.out.println("Adding product with weight 60");
            obj.productCheck(60);
        } catch (InvalidProductException ex) {
            System.out.println("Caught the exception");
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}