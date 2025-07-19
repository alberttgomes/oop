package com.sales.analytics.service;

import com.sales.analytics.model.Sale;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Albert Gomes Cabral
 */
public class SaleService {

    public static void totalSellBySeller(List<Sale> sales) throws RuntimeException {
        System.out.println("\nTotal selling by seller");

        Map<String, Double> totalSellBySellerMap = sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getSeller,
                Collectors.summingDouble(Sale::getTotal)
            ));

        totalSellBySellerMap.forEach(
            (seller, total) ->
                System.out.printf("Seller: %s Total: %.2f\n", seller, total));
    }

}
