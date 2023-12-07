package proyecto.vero.proyectoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class HeladoEspecial extends AppCompatActivity {

    Button Atras;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helado_especial);
        Atras = findViewById(R.id.btnAtrasHE);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);
        c10 = findViewById(R.id.c10);
        c11 = findViewById(R.id.c11);
        c12 = findViewById(R.id.c12);
        c13 = findViewById(R.id.c13);
        c14 = findViewById(R.id.c14);

    c13.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c1.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });


            c2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c2.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c3.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c4.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c5.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c6.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c7.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c8.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c9.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c10.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);

                        }

                    }
                }
            });
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c11.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c12.setVisibility(View.GONE);


                        }

                    }
                }
            });
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isHeladoSimple = ((CheckBox) v).isChecked();

                    if (isHeladoSimple) {
                        c12.setVisibility(View.VISIBLE);
                        if (isHeladoSimple) {
                            c1.setVisibility(View.GONE);
                            c2.setVisibility(View.GONE);
                            c3.setVisibility(View.GONE);
                            c4.setVisibility(View.GONE);
                            c5.setVisibility(View.GONE);
                            c6.setVisibility(View.GONE);
                            c7.setVisibility(View.GONE);
                            c8.setVisibility(View.GONE);
                            c9.setVisibility(View.GONE);
                            c10.setVisibility(View.GONE);
                            c11.setVisibility(View.GONE);


                        }

                    }
                }
            });


            Atras.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(
                            getApplicationContext(),
                            SegundaPantalla.class);
                    startActivity(intent);

                }
            });

        }
    });



    }
}





