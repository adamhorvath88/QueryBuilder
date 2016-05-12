package querybuilder;

import querybuilder.sql.SqlQuery;
import querybuilder.sample.Celebrity;

import java.util.Collection;

/**
 * .
 * @author Adam
 */
public class QueryBuilder {

	public void sample() {
		Query from = SqlQuery.Select().from(Celebrity.class);

		Query allCelebs = SqlQuery.Select().from(Celebrity.class);

		System.out.println(allCelebs.toString());

		Collection<Celebrity> celebs = allCelebs.execute();

		Query celebsAges = SqlQuery.Select().distinct("age").from(Celebrity.class);

		Query whoIs22YO = SqlQuery.Select().count().from(Celebrity.class).where("age").equal(22);

		Query addBieber = SqlQuery.Insert().into(Celebrity.class, "id", "name", "age").values(1, "Justin Bieber", 21);

		Query celebNames = SqlQuery.Select("name").from(Celebrity.class);

		Query makeFirstCeleb22 = SqlQuery.Update(Celebrity.class).set("age", 22).where("id").equal(1);

		Query deleteTwitterVirgins = SqlQuery.Delete().from(Celebrity.class).where("twitterHandle").isNull();
	}
}
