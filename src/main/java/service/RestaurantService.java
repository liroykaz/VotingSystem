package service;

import model.DailyMenu;
import model.MenuItem;
import model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {

    void saveRestaurant(Restaurant restaurant);

    void createRestaurant(Restaurant restaurant);

    void removeRestaurant(Restaurant restaurant);

    List<Restaurant> getAll();

    Restaurant getRestaurantById(Integer integer);

    List<Restaurant> getRestaurantByName(String name);

    List<DailyMenu> getTodayMenuForAllRestaurant();

    DailyMenu getTodayMenuForSelectedRestaurant(Integer restaurantId);

    void createDailyMenu(DailyMenu dailyMenu);

    void removeDailyMenu(DailyMenu dailyMenu);

    void createMenuItem(MenuItem menuItem);

    void removeMenuItem(MenuItem menuItem);

    void addMenuItemsToDailyMenu(List<MenuItem> menuItems, DailyMenu dailyMenu);

    void clearAllItemsFromDailyMenu(DailyMenu dailyMenu);
}
