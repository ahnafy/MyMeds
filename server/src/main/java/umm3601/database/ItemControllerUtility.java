package umm3601.database;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ItemControllerUtility {
    private final ItemController itemController;

    public ItemControllerUtility(ItemController itemController) {
        this.itemController = itemController;
    }

    public MongoCollection<Document> getCollectionByName(String nameOfCollection) {
        if (nameOfCollection.equals("items")) {
            return itemController.getItemCollection();
        } else if (nameOfCollection.equals("emoji")) {
            return itemController.getEmojiCollection();
        } else if (nameOfCollection.equals("userId")) {
            return itemController.getUserIdCollection();
        } else if(nameOfCollection.equals("goals")) {
            return itemController.getGoalCollection();
        } else {
            return null;
        }
    }

    public static String[] getKeysByCollectionName(String name) {
        if (name.equals("emoji")) {
            return new String[]{"user_id", "emoji", "datetime"};
        } else if (name.equals("goals")) {
            return null;
        } else if (name.equals("items")) {
            return new String[]{"name", "goal", "category"};
        } else if(name.equals("userId")) {
            return new String[]{"userId", "userName", "timeCreated"};
        } else {
            return null;
        }
    }

    public int getNewUserId() {
        return itemController.getNewUserId();
    }
}