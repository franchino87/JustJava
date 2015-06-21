package com.drunkencoder.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int quantity = 0;
    int price = 5;
    /**dfgdg
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String stringa = (quantity*price)+" Grazie!!!";
        displayMessage(stringa);

    }

    public void increment(View view) {
        quantity++;
        display(quantity);
        displayPrice(quantity*price);
    }

    public void decrement(View view) {
        quantity--;
        display(quantity);
        displayPrice(quantity*price);

    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView;
        quantityTextView = (TextView) findViewById(
                R.id.textView2);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textView4);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.textView4);
        priceTextView.setText(message);
    }



}