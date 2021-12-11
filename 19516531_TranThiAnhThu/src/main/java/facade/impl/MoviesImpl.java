package facade.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityTransaction;

import org.bson.types.ObjectId;

import facade.MoviesFacade;
import model.Movies;

public class MoviesImpl extends AbstractImpl implements MoviesFacade {
	public MoviesImpl() throws RemoteException {
		super();
	}

	@Override
	public boolean themMV(Movies MV) throws RemoteException {
		return them(MV);
	}

	@Override
//	db.movies.find()
	public List<Movies> layDSMovies() throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			List<Movies> list = em.createNativeQuery("{}", Movies.class).getResultList();
			tr.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}

	@Override
//	Thu19516531> db.movies.createIndex({directors:'text', title:'text'})
//	directors_text_title_text
//	Thu19516531> db.movies.find({$text:{$search:'Winsor'}})
	public List<Movies> layDSMVTheoTen(String tenMV) throws RemoteException {
		List<?> ds = getList("{$text:{$search:'" + tenMV + "'}}", Movies.class);
		return (List<Movies>) ds;
	}

//	Thu19516531> db.movies.find({ _id: ObjectId("573a1390f29313caabcd4803")})
	@Override
	public Movies layMVTheoMa(String maMV) throws RemoteException {
		return (Movies) getSingle("{ _id: ObjectId(\"" + maMV + "\")}", Movies.class);
	}

	@Override
	public boolean themListMV(List<Movies> MV) throws RemoteException {
		// TODO Auto-generated method stub
		return them(MV);
	}

	@Override
	public boolean capNhatMV(Movies NV) throws RemoteException {
		return capNhat(NV);
	}

//	Thu19516531> db.movies.aggregate([{$group:{_id:'$year','number of movies':{$count:{}}}},{ $replaceWith: { $mergeObjects: [{'number of movies':"$number of movies"}, { year: "$_id"}] } }])
	@Override
	public Map<Integer, Integer> demMVTheoNam() throws RemoteException {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		String query = "db.movies.aggregate([{'$group':{'_id':'$year','number of movies':{'$count':{}}}},{ '$replaceWith': { '$mergeObjects': [{'number of movies':'$number of movies'}, { 'year': '$_id'}] } }])";

		List<?> list = em.createNativeQuery(query).getResultList();

		for (Object obj : list) {
			Object[] o = (Object[]) obj;
//			Long id = Long.parseLong(rs[0].toString());
			int year = (int) o[1];
//			Movies course = em.find(Movies.class, year);
			int  count= (int) o[0];
			map.put(year, count);
		}

		return map;
	}
//	Thu19516531> db.movies.find({$and:[{'imdb.votes':{$gt:5}},{'imdb.votes':{$lt:10}}]})
	@Override
	public List<Movies> timTheoKhoangVotes(int to, int from) throws RemoteException {
		List<?> ds = getList("{$and:[{'imdb.votes':{$gt:"+to+"}},{'imdb.votes':{$lt:"+from+"}}]}", Movies.class);
		return (List<Movies>) ds;
	}
}
