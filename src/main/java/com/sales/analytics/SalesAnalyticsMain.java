package com.sales.analytics;

import com.sales.analytics.builder.SaleBuilder;
import com.sales.analytics.service.SaleService;

import java.util.Scanner;

/**
 * @author Albert Gomes Cabral
 */
public class SalesAnalyticsMain {

    public static void main(String[] args) {
        System.out.println("Initializing SalesAnalytics... \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the full content path: ");

        String path = scanner.nextLine();

        SaleBuilder saleBuilder = new SaleBuilder();

        saleBuilder.build(path);

        SaleService.totalSellBySeller(saleBuilder.SALES);
    }

}
