package querybuilder;

/**
 * .
 * @author Adam
 */
public class QueryBuilder {

	public void sample() {
		new Select().from(Celebrity.class);

		new InsertInto(Celebrity.class, "id", "namne", "age").values(1, "Justin Bieber", 21);

		new Select("name").from(Celebrity.class);

		new Update(Celebrity.class).set("age", 22).where("id").is(1);

		new DeleteFrom(Celebrity.class).where("twitterHandle").isNull();
	}
}
