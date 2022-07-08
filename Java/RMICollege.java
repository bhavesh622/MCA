import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICollege extends Remote {
    void Admit(int rollno, String Name) throws RemoteException;
    String SearchRecord(int rollno) throws RemoteException;
    void Display() throws RemoteException;
}