package exception.throwsAnException;

import java.rmi.RemoteException;

public class ThrowsAnExceptionDemo {

    public void deposit(double amount) throws RemoteException {
        // Method implementation
        throw new RemoteException();
    }
    // Remainder of class definition
}
