package facade;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import model.Movies;

public interface MoviesFacade extends Remote{
	public boolean themListMV(List<Movies> MV) throws RemoteException;
	public boolean themMV(Movies MV) throws RemoteException;
	public boolean capNhatMV(Movies NV) throws RemoteException;
	public List<Movies> layDSMovies() throws RemoteException;
	public List<Movies> layDSMVTheoTen(String tenMV) throws RemoteException;
	public Movies layMVTheoMa(String maMV) throws RemoteException;
	public Map<Integer, Integer> demMVTheoNam() throws RemoteException;
	public List<Movies> timTheoKhoangVotes(int to, int from) throws RemoteException;
}
