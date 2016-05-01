package querybuilder;

/**
 * .
 * @author Adam
 */
public class QueryBuilder {

	public void sample() {
		Query allCelebs = Query.Select().from(Celebrity.class);

		Query celebsAges = Query.Select().distinct("age").from(Celebrity.class);

		Query whoIs22YO = Query.Select().count().from(Celebrity.class).where("age").equal(22);

		Query addBieber = Query.Insert().into(Celebrity.class, "id", "name", "age").values(1, "Justin Bieber", 21);

		Query celebNames = Query.Select("name").from(Celebrity.class);

		Query makeFirstCeleb22 = Query.Update(Celebrity.class).set("age", 22).where("id").equal(1);

		Query deleteTwitterVirgins = Query.Delete().from(Celebrity.class).where("twitterHandle").isNull();
	}
}
