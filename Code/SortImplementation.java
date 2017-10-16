import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class SortImplementation extends UnicastRemoteObject
        implements ISort {

    public SortImplementation() throws RemoteException {
        //There is no action need in this moment.
    }
    

    public int[] SapXep(int a[]) throws RemoteException {
        
        Arrays.sort(a);
        return a;
    }
}