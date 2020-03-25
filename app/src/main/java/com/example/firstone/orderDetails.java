package com.example.firstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class orderDetails extends AppCompatActivity implements View.OnClickListener {
    TextView menu, halimTextView, btv, ftv, rtv, ptv, dtv, pastatv, souptv;
    TextView hallimptv, biriyaniptv, fryptv, riceptv, pizzaptv, drinksptv, pastaptv, soupptv;

    Button biriyani, haleem, fried, plain, pizza, drinks, pasta, soup;

    Button rm_biriyani, rm_haleem, rm_fried, rm_plain, rm_pizza, rm_drinks, rm_pasta, rm_soup, order;
    int bp = 0, hp = 0, pp = 0, drp = 0, frp = 0, pizzap = 0, pastap = 0, soupPrice = 0;
    int tbp = 0, thp = 0, tpp = 0, tdrp = 0, tfrp = 0, tpizza = 0;
    int total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        menu = findViewById(R.id.menuList);
        halimTextView = findViewById(R.id.haleem_textView);
        btv = findViewById(R.id.biriyani_textView);
        ftv = findViewById(R.id.fried_textView);
        rtv = findViewById(R.id.plain_textView);
        ptv = findViewById(R.id.pizza_textView);
        dtv = findViewById(R.id.drinks_textView);
        pastatv = findViewById(R.id.pasta_textView);
        soupptv = findViewById(R.id.soup_textView);


        biriyani = (Button) findViewById(R.id.biriyani_button);
        haleem = (Button) findViewById(R.id.haleem_button);
        fried = (Button) findViewById(R.id.fried_button);
        plain = (Button) findViewById(R.id.plain_button);
        pizza = (Button) findViewById(R.id.pizza_button);
        drinks = (Button) findViewById(R.id.drinks_button);
        pasta = (Button) findViewById(R.id.pasta_button);
        soup = (Button) findViewById(R.id.soup_button);

        rm_biriyani = (Button) findViewById(R.id.biriyani_button_rm);
        rm_haleem = (Button) findViewById(R.id.haleem_button_rm);
        rm_fried = (Button) findViewById(R.id.fried_button_rm);
        rm_pizza = (Button) findViewById(R.id.pizza_button_rm);
        rm_plain = (Button) findViewById(R.id.plain_button_rm);
        rm_drinks = (Button) findViewById(R.id.drinks_button_rm);
        rm_pasta = (Button) findViewById(R.id.pasta_button_rm);
        rm_soup = (Button) findViewById(R.id.soup_button_rm);

        order = (Button) findViewById(R.id.orderButton);
        order.setOnClickListener(this);


    }

    public void add_to_list(View view) {


        if (view == findViewById(R.id.haleem_button)) {
            Toast.makeText(this, "Halim Added", Toast.LENGTH_SHORT).show();
            hp = hp + 1;


            haleem.setText(Integer.toString(hp));

        } else if (view == findViewById(R.id.biriyani_button)) {
            Toast.makeText(this, "Biriyani Added", Toast.LENGTH_SHORT).show();

            bp = bp + 1;

            biriyani.setText(Integer.toString(bp));

        } else if (view == findViewById(R.id.fried_button)) {
            Toast.makeText(this, "French Fry Added", Toast.LENGTH_SHORT).show();

            frp = frp + 1;
            fried.setText(Integer.toString(frp));

        } else if (view == findViewById(R.id.plain_button)) {
            Toast.makeText(this, "Rice Added", Toast.LENGTH_SHORT).show();

            pp = pp + 1;

            plain.setText(Integer.toString(pp));
        } else if (view == findViewById(R.id.pizza_button)) {
            Toast.makeText(this, "Pizza Added", Toast.LENGTH_SHORT).show();

            pizzap = pizzap + 1;

            pizza.setText(Integer.toString(pizzap));
        } else if (view == findViewById(R.id.drinks_button)) {
            Toast.makeText(this, "Drinks Added", Toast.LENGTH_SHORT).show();


            drp = drp + 1;

            drinks.setText(Integer.toString(drp));
        } else if (view == findViewById(R.id.pasta_button)) {
            Toast.makeText(this, "Pasta Added", Toast.LENGTH_SHORT).show();
            pastap = pastap + 1;
            pasta.setText(Integer.toString(pastap));
        } else if (view == findViewById(R.id.soup_button)) {
            Toast.makeText(this, "Soup Added", Toast.LENGTH_SHORT).show();
            soupPrice = soupPrice + 1;
            soup.setText(Integer.toString(soupPrice));
        }

    }


    public void rmv_from_list(View view) {


        if (view == findViewById(R.id.haleem_button_rm)) {
            if (hp > 0) {

                hp = hp - 1;
                haleem.setText(Integer.toString(hp));
                Toast.makeText(this, "Haleem Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();


        } else if (view == findViewById(R.id.biriyani_button_rm)) {


            if (bp > 0) {
                bp = bp - 1;

                biriyani.setText(Integer.toString(bp));
                Toast.makeText(this, "Biriyani Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();

        } else if (view == findViewById(R.id.fried_button_rm)) {


            if (frp > 0) {

                frp = frp - 1;
                fried.setText(Integer.toString(frp));
                Toast.makeText(this, "French Fry Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();

        } else if (view == findViewById(R.id.plain_button_rm)) {

            if (pp > 0) {

                pp = pp - 1;
                plain.setText(Integer.toString(pp));
                Toast.makeText(this, "Rice Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();


        } else if (view == findViewById(R.id.pizza_button_rm)) {

            if (pizzap > 0) {

                pizzap = pizzap - 1;
                pizza.setText(Integer.toString(pizzap));
                Toast.makeText(this, "Pizza Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();


        } else if (view == findViewById(R.id.drinks_button_rm)) {

            if (drp > 0) {
                drp = drp - 1;
                drinks.setText(Integer.toString(drp));
                Toast.makeText(this, "Drinks Removed", Toast.LENGTH_SHORT).show();
            }

            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();

        } else if (view == findViewById(R.id.soup_button_rm)) {

            if (soupPrice > 0) {
                soupPrice = soupPrice - 1;
                soup.setText(Integer.toString(drp));
                Toast.makeText(this, "Soup Removed", Toast.LENGTH_SHORT).show();
            }

            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();

        }
        else if (view == findViewById(R.id.pasta_button_rm)) {

            if (pastap > 0) {
                pastap= pastap - 1;
                pasta.setText(Integer.toString(pastap));
                Toast.makeText(this, "Pasta Removed", Toast.LENGTH_SHORT).show();
            }

            Toast.makeText(this, "Add Any Item First", Toast.LENGTH_SHORT).show();

        }
    }


    @Override
    public void onClick(View v) {
        Intent OrderPlacedIntent = new Intent(orderDetails.this, Confirm.class);
        startActivity(OrderPlacedIntent);


    }
}
