package string.manipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Regex_Pattern {

   // public static String endeca_rule = "8^/content/ASDASearch/ASDAResultsListPage/Frozen/sweetcorn - boost top items 201927^Default^Default";
    //public static String solr_rule = "8^rule_Frozen/sweetcorn - boost top items 201927/^nterms,maxfield,glom,exact,static(sku.salesRevenue,ascending),static(sku.salesRank,descending)^Default";

    public static String endeca_rule = "0^/content/ASDASearch/ASDAResultsListPage/(DO NOT MODIFY) Default Search Rule Folder/(DO NOT MODIFY) Default Search Rule^Default^Default";
    public static String solr_rule = "0^rule_(DO NOT MODIFY) Default Search Rule/^nterms,maxfield,glom,exact,static(sku.salesRevenue,ascending),static(sku.salesRank,descending)^Default";


    //0^/content/ASDASearch/ASDAResultsListPage/(DO NOT MODIFY) Default Search Rule Folder/(DO NOT MODIFY) Default Search Rule^Default^Default
    //0^rule_(DO NOT MODIFY) Default Search Rule/^nterms,maxfield,glom,exact,static(sku.salesRevenue,ascending),static(sku.salesRank,descending)^Default

    public static void main(String[] args){

        Pattern pt = Pattern.compile(".*?^");
        Matcher match = pt.matcher(endeca_rule);

        System.out.println(endeca_rule.substring(0,endeca_rule.indexOf("^")));

      //  System.out.println(solr_rule.substring(solr_rule.indexOf("_")+1,(solr_rule.length()-1 )));

        String solr_rule1 = solr_rule.substring(solr_rule.indexOf("_")+1,(solr_rule.length()-1 ));
        System.out.println(solr_rule1.substring(0,solr_rule1.indexOf("^")-1));


        String endeca_rule1 = endeca_rule.substring(endeca_rule.indexOf("^")+41,(endeca_rule.length()-1 ));

        System.out.println(endeca_rule1.substring(0,endeca_rule1.indexOf("^")));



    }


}
