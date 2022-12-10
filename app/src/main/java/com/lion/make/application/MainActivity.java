package com.lion.make.application;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout lay = new LinearLayout(this);
        lay.setOrientation(LinearLayout.VERTICAL);
        TextView text = new TextView(this);
        text.setText("      Test Terror Application");
        Button btn=new Button(this);
        btn.setText("Set act");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager p=getPackageManager();
                p.setComponentEnabledSetting(new ComponentName(MainActivity.this,Activity25.class),
                        PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                        PackageManager.COMPONENT_ENABLED_STATE_DEFAULT);
                p.setComponentEnabledSetting(new ComponentName(MainActivity.this,Activity26.class),
                        PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                        PackageManager.COMPONENT_ENABLED_STATE_DEFAULT);
                Toast.makeText(MainActivity.this, "visible", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                PackageManager p=getPackageManager();
                p.setComponentEnabledSetting(new ComponentName(MainActivity.this,Activity25.class),
                        PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                        PackageManager.COMPONENT_ENABLED_STATE_DEFAULT);
                p.setComponentEnabledSetting(new ComponentName(MainActivity.this,Activity26.class),
                        PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                        PackageManager.COMPONENT_ENABLED_STATE_DEFAULT);
                Toast.makeText(MainActivity.this, "not visible", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        lay.addView(text);
        lay.addView(btn);
        setContentView(lay);
    }
    private boolean isThisHiddenActivity() {
        return this instanceof Activity25;
    }
    static public class Activity1  extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity2  extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity3  extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity4 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity5 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity6 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity7 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity8 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity9 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity10 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity11 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity12 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity13 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity14 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity15 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity16 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity17 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity18 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity19 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity20 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity21 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity22 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity23 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }

    static public class Activity24 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }
    static public class Activity25 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            TextView text = new TextView(this);
            text.setText("can visible?");
            lay.addView(text);
            setContentView(lay);
        }
    }
    static public class Activity26 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            LinearLayout lay = new LinearLayout(this);
            setContentView(lay);
        }
    }




}

