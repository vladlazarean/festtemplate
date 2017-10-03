package com.example.vlad.festivaltemplateapp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.value;

public class MainScreen extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private RelativeLayout mDrawerLeft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

    // init menu drawer
        menuDrawerInit();




    }

    public void getTicket(View v) {
        Intent myIntent = new Intent(this, GetTicket.class);
        //myIntent.putExtra("key", value); //Optional parameters
        this.startActivity(myIntent);
    }


    private void menuDrawerInit() {

        // MENU drawer
        ImageView icon_menu_drawer = (ImageView) this.findViewById(R.id.icon_menu_drawer);
        icon_menu_drawer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(mDrawerLeft);

            }
        });


        mDrawerLayout = (DrawerLayout) this.findViewById(R.id.drawer_layout);
        mDrawerLeft = (RelativeLayout) this.findViewById(R.id.left_drawer);
        final RelativeLayout mainLayout = (RelativeLayout) this.findViewById(R.id.layoutMainScreen);
        final LinearLayout drawerLayoutContent = (LinearLayout) findViewById(R.id.left_drawer_content);

        mDrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {

            @Override
            public void onDrawerStateChanged(int arg0) {
            }

            @Override
            public void onDrawerSlide(View arg0, float arg1) {
                /*
                 * float deltaX = arg1 * mDrawerLeft.getWidth(); int drawerLeft
				 * = (int) (0.75 * mDrawerLeft.getWidth());
				 * mainLayout.setLeft((int) deltaX);
				 * drawerLayoutContent.setLeft((int) (drawerLeft * (1 - arg1)));
				 */
            }

            @Override
            public void onDrawerOpened(View v) {
            }

            @Override
            public void onDrawerClosed(View arg0) {
            }
        });

        //end MENU drawer
    }

}
