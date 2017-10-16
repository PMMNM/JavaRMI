import java.rmi.*;
import java.util.ArrayList;

public interface ISort extends Remote
{
    
    public int[] SapXep(int a[]) throws RemoteException;
}
