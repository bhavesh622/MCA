import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

  class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

class StudentSearchQuery extends UnicastRemoteObject implements RMICollege {
    int rollno;
    String name;
    int index = 0;
    List<StudentSearchQuery> list = new ArrayList<>();

    StudentSearchQuery() throws RemoteException {
        super();
    }

    StudentSearchQuery(int rollno, String name) throws RemoteException {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public void Admit(int rollno, String name) throws RemoteException {
        list.add(index++, new StudentSearchQuery(rollno, name));
        Display();
    }

    @Override
    public String SearchRecord(int rollno) throws RemoteException {
        for (StudentSearchQuery s : list) {
            try {
                if (s.rollno == rollno) {
                    System.out.println("Result Found, RollNo: " + s.rollno + " Name: " + s.name);
                    return s.name;
                } else {
                    throw new MyException("No Data Found");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void Display() throws RemoteException {
        for (StudentSearchQuery s : list) {
            System.out.println("RollNo: " + s.rollno + " Name: " + s.name);
        }
    }
}