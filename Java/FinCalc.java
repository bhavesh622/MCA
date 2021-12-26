public class FinCalc {
    static double simpleInterest(double principal, double time, double rate){
        return (principal * time * rate /100);
    };
    static double compoundInterest(double principal, double time, double rate){
        return (principal * (Math.pow((1 + rate/100), (time))) - principal);
    };
    static double finalVal(double principal, double time, double rate){
        return (principal * (Math.pow((1 + rate/100), time)));
    }
    public static void main(String[] args) {
        System.out.println("Principal: " + args[0]);
        System.out.println("Interest Rate: " + args[1]);
        System.out.println("Time Duration: " + args[2]);
        System.out.println("Simple Interest: " + simpleInterest(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));
        System.out.println("Compound Interest: " + compoundInterest(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));
        System.out.println("Final Value: " + finalVal(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));
      }
    }