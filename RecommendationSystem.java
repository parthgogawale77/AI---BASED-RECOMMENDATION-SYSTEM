import java.io.File;
import java.util.List;

// Mahout libraries
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;

import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class RecommendationSystem {

    public static void main(String[] args) {

        try {

            // Reads rating data from data.csv
            // Format: UserID, ProductID, Rating
            DataModel model =
                    new FileDataModel(
                    new File("data.csv"));


            // Finds similarity between users
            // Pearson compares user rating patterns
            UserSimilarity similarity =
                    new PearsonCorrelationSimilarity(model);


            // Finds top 2 nearest users
            // having similar interests
            UserNeighborhood neighborhood =
                    new NearestNUserNeighborhood(
                            2,
                            similarity,
                            model);


            // Creates recommendation engine
            Recommender recommender =
                    new GenericUserBasedRecommender(
                            model,
                            neighborhood,
                            similarity);


            // Recommend 3 products for User 1
            List<RecommendedItem> recommendations =
                    recommender.recommend(1,3);


            System.out.println(
                    "Recommendations for User 1:");



            // Print recommended products
            for(RecommendedItem item :
                    recommendations){

                System.out.println(
                        "Product ID: "
                        + item.getItemID()

                        + " Score: "

                        + item.getValue());

            }

        }

        // Handle errors
        catch(Exception e){

            e.printStackTrace();

        }

    }

}
