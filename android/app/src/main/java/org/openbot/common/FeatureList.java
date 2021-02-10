package org.openbot.common;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.openbot.R;
import org.openbot.model.Category;
import org.openbot.model.SubCategory;

public class FeatureList {
  // region Properties

  // Global
  public static final String ALL = "All";
  public static final String DEFAULT = "Default";
  public static final String CONTROLLER = "Controller";

  // Game
  public static final String GAME = "Game";
  public static final String FREE_ROAM = "Free Roam";
  public static final String AR_MODE = "AR Mode";

  // Data Collection
  public static final String DATA_COLLECTION = "Data Collection";
  public static final String LOCAL_SAVE_ON_PHONE = "Local (save On Phone)";
  public static final String EDGE_LOCAL_NETWORK = "Edge (local Network)";
  public static final String CLOUD_FIREBASE = "Cloud (firebase)";
  public static final String CROWD_SOURCE = "Crowd-source (post/accept Data Collection Tasks)";

  // AI
  public static final String AI = "AI";
  public static final String AI_MODELS = "AI Models";
  public static final String PERSON_FOLLOWING = "Person Following";
  public static final String OBJECT_NAV = "Object Nav (follow/search)";
  public static final String AUTONOMOUS_DRIVING = "Autonomous Driving";
  public static final String VISUAL_GOALS = "Visual Goals";
  public static final String SMART_VOICE = "Smart Voice (left/right/straight, Ar Core)";

  // Remote Access
  public static final String REMOTE_ACCESS = "Remote Access";
  public static final String WEB_INTERFACE = "Web Interface";
  public static final String ROS = "ROS";
  public static final String FLEET_MANAGEMENT = "Fleet Management";

  // Coding
  public static final String CODING = "Coding";
  public static final String BLOCK_BASED_PROGRAMMING = "Block-Based Programming";
  public static final String SCRIPTS = "Scripts";

  // Research
  public static final String RESEARCH = "Research";
  public static final String CLASSICAL_ROBOTICS_ALGORITHMS = "Classical Robotics Algorithms";
  public static final String BACKEND_FOR_LEARNING = "Backend For Learning";

  // Monitoring
  public static final String MONITORING = "Monitoring";
  public static final String SENSORS_FROM_CAR = "Sensors from Car";
  public static final String SENSORS_FROM_PHONE = "Sensors from Phone";
  public static final String MAP_VIEW = "Map View";
  // endregion

  @NotNull
  public static ArrayList<Category> getCategories() {
    ArrayList<Category> categories = new ArrayList<>();

    ArrayList<SubCategory> subCategories = new ArrayList<>();
    subCategories.add(new SubCategory(DEFAULT, R.drawable.openbot_icon, "#4B7BFF"));
    subCategories.add(new SubCategory(FREE_ROAM, R.drawable.ic_game, "#FFFF6D00"));
    subCategories.add(new SubCategory(DATA_COLLECTION, R.drawable.ic_storage, "#93C47D"));
    //    subCategories.add(new SubCategory(AI_MODELS, R.drawable.ic_person_search, "#FFD966"));
    categories.add(new Category(ALL, subCategories));

    //    subCategories = new ArrayList<>();
    //    subCategories.add(new SubCategory(CONTROLLER, R.drawable.ic_controller));
    //    subCategories.add(new SubCategory(FREE_ROAM, R.drawable.ic_game, "#FFFF6D00"));
    //    subCategories.add(new SubCategory(AR_MODE, R.drawable.ic_game, "#B3FF6D00"));
    //    categories.add(new Category(GAME, subCategories));

    //    subCategories = new ArrayList<>();
    //    subCategories.add(new SubCategory(LOCAL_SAVE_ON_PHONE, R.drawable.ic_storage, "#93C47D"));
    //        subCategories.add(new SubCategory(EDGE_LOCAL_NETWORK,
    // R.drawable.ic_network));
    //        subCategories.add(new SubCategory(CLOUD_FIREBASE,
    // R.drawable.ic_cloud_upload));
    //        subCategories.add(new SubCategory(CROWD_SOURCE, R.drawable.openbot_icon));
    //    categories.add(new Category(DATA_COLLECTION, subCategories));
    /*
        subCategories = new ArrayList<>();
        subCategories.add(new SubCategory(PERSON_FOLLOWING, R.drawable.ic_person_search));
        subCategories.add(new SubCategory(OBJECT_NAV, R.drawable.openbot_icon));
        subCategories.add(new SubCategory(SMART_VOICE, R.drawable.ic_voice_over));
        subCategories.add(new SubCategory(AUTONOMOUS_DRIVING, R.drawable.openbot_icon));
        subCategories.add(new SubCategory(VISUAL_GOALS, R.drawable.openbot_icon));
        categories.add(new Category(AI, subCategories));

        subCategories = new ArrayList<>();
        subCategories.add(new SubCategory(WEB_INTERFACE, R.drawable.openbot_icon));
        subCategories.add(new SubCategory(ROS, R.drawable.openbot_icon));
        subCategories.add(new SubCategory(FLEET_MANAGEMENT, R.drawable.openbot_icon));
        categories.add(new Category(REMOTE_ACCESS, subCategories));

        subCategories = new ArrayList<>();
        subCategories.add(new SubCategory(BLOCK_BASED_PROGRAMMING, R.drawable.ic_code));
        subCategories.add(new SubCategory(SCRIPTS, R.drawable.ic_code));
        categories.add(new Category(CODING, subCategories));

        subCategories = new ArrayList<>();
        subCategories.add(
            new SubCategory(CLASSICAL_ROBOTICS_ALGORITHMS, R.drawable.openbot_icon));
        subCategories.add(new SubCategory(BACKEND_FOR_LEARNING, R.drawable.openbot_icon));
        categories.add(new Category(RESEARCH, subCategories));

        subCategories = new ArrayList<>();
        subCategories.add(new SubCategory(SENSORS_FROM_CAR, R.drawable.ic_electric_car));
        subCategories.add(new SubCategory(SENSORS_FROM_PHONE, R.drawable.ic_phonelink));
        subCategories.add(new SubCategory(MAP_VIEW, R.drawable.ic_map));
        categories.add(new Category(MONITORING, subCategories));
    */

    return categories;
  }
}