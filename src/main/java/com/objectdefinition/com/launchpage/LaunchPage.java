package com.objectdefinition.com.launchpage;


import java.util.HashMap;

public class LaunchPage {
        public static LaunchPage lp = null;

        private static final String womenLink = "//a[@title = 'Women']";
//        private static final String dressesLink = "//li//a[@title = 'Dresses' and @class= 'sf-with-ul']";
        private static final String dressesLink = "//a [@class = 'sf-with-ul' and contains(text(), 'Dresses')]";
        private static final String tShirtLink =  "//a[@title = 'T-shirts']";
        private static final String popularLink = "//a[contains(text(), 'Popular')]";
        private static final String bestSellerLink = "//a[contains(text(), 'Best Sellers')]";
        private static final String myLogo = "//a[@title = 'My Store']";

        private LaunchPage()
        {

        }

        public static LaunchPage getLauncPageElements()
        {
            if(lp == null)
                lp = new LaunchPage();

            return lp;
        }
        public HashMap<String, String> getObjectXPath()
        {
            HashMap<String, String> objXPath = new HashMap<>();

            objXPath.put("Women" , womenLink);
            objXPath.put("Dresses" , dressesLink);
            objXPath.put("T-Shirts" , tShirtLink);
            objXPath.put("Popular" , popularLink);
            objXPath.put("Best Sellers" , bestSellerLink);
            objXPath.put("My Store" , myLogo);

            return objXPath;
        }

        public HashMap<String, String> getObjectAction()
        {
            HashMap<String, String> objAction = new HashMap<>();

            objAction.put("Women" , "click");
            objAction.put("Dresses" , "click");
            objAction.put("T-Shirts" , "click");
            objAction.put("Popular" , "click");
            objAction.put("Best Sellers" , "click");
            objAction.put("My Store" , "click");

            return objAction;
        }


}
