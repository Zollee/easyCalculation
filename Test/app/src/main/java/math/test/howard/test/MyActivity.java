package math.test.howard.test;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.math.BigDecimal;
import com.singularsys.jep.Jep;

public class MyActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);

            final TextView editText = (TextView)rootView.findViewById(R.id.editText);
            final TextView showResult = (TextView)rootView.findViewById(R.id.showResult);

            Button number0 = (Button)rootView.findViewById(R.id.number0);
            Button number1 = (Button)rootView.findViewById(R.id.number1);
            Button number2 = (Button)rootView.findViewById(R.id.number2);
            Button number3 = (Button)rootView.findViewById(R.id.number3);
            Button number4 = (Button)rootView.findViewById(R.id.number4);
            Button number5 = (Button)rootView.findViewById(R.id.number5);
            Button number6 = (Button)rootView.findViewById(R.id.number6);
            Button number7 = (Button)rootView.findViewById(R.id.number7);
            Button number8 = (Button)rootView.findViewById(R.id.number8);
            Button number9 = (Button)rootView.findViewById(R.id.number9);

            Button point = (Button)rootView.findViewById(R.id.point);
            Button plus = (Button)rootView.findViewById(R.id.plus);
            Button subtraction = (Button)rootView.findViewById(R.id.subtraction);
            Button multiplication = (Button)rootView.findViewById(R.id.multiplication);
            Button division = (Button)rootView.findViewById(R.id.division);
            Button equal = (Button)rootView.findViewById(R.id.equal);
            ImageButton delete = (ImageButton)rootView.findViewById(R.id.delete);

            number0.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit0 = editText.getText().toString();
                    edit0 += "0";
                    editText.setText(edit0);
                }
            });

            number1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit1 = editText.getText().toString();
                    edit1 += "1";
                    editText.setText(edit1);
                }
            });

            number2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit2 = editText.getText().toString();
                    edit2 += "2";
                    editText.setText(edit2);
                }
            });

            number3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit3 = editText.getText().toString();
                    edit3+="3";
                    editText.setText(edit3);
                }
            });

            number4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit4 = editText.getText().toString();
                    edit4 += "4";
                    editText.setText(edit4);
                }
            });

            number5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit5 = editText.getText().toString();
                    edit5+="5";
                    editText.setText(edit5);
                }
            });

            number6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit6 = editText.getText().toString();
                    edit6+="6";
                    editText.setText(edit6);
                }
            });

            number7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit7 = editText.getText().toString();
                    edit7+="7";
                    editText.setText(edit7);
                }
            });

            number8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit8 = editText.getText().toString();
                    edit8+="8";
                    editText.setText(edit8);
                }
            });

            number9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String edit9 = editText.getText().toString();
                    edit9+="9";
                    editText.setText(edit9);
                }
            });

            point.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String editPoint = editText.getText().toString();
                    editPoint+=".";
                    editText.setText(editPoint);
                }
            });

            plus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String editPlus = editText.getText().toString();

                    if (editPlus.equals("-") || editPlus.endsWith("+"));
                    else if(editPlus.endsWith("-") || editPlus.endsWith("×") || editPlus.endsWith("/"))
                        editPlus=editPlus.substring(0,editPlus.length()-1)+"+";
                    else if(!editPlus.equals(""))
                        editPlus += "+";

                    editText.setText(editPlus);
                }
            });

            subtraction.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String editSubtraction = editText.getText().toString();

                    if (editSubtraction.endsWith("-"));
                    else if(editSubtraction.endsWith("+") || editSubtraction.endsWith("×") || editSubtraction.endsWith("/"))
                        editSubtraction=editSubtraction.substring(0,editSubtraction.length()-1)+"-";
                    else
                        editSubtraction += "-";

                    editText.setText(editSubtraction);
                }
            });

            multiplication.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String editMulti = editText.getText().toString();

                    if (editMulti.equals("-") || editMulti.endsWith("×"));
                    else if(editMulti.endsWith("-") || editMulti.endsWith("+") || editMulti.endsWith("/"))
                        editMulti=editMulti.substring(0,editMulti.length()-1)+"×";
                    else if(!editMulti.equals(""))
                        editMulti += "×";

                    editText.setText(editMulti);
                }
            });

            division.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String editDivision = editText.getText().toString();

                    if (editDivision.equals("-") || editDivision.endsWith("/"));
                    else if(editDivision.endsWith("-") || editDivision.endsWith("×") || editDivision.endsWith("+"))
                        editDivision=editDivision.substring(0,editDivision.length()-1)+"/";
                    else if(!editDivision.equals(""))
                        editDivision += "/";

                    editText.setText(editDivision);
                }
            });

            equal.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String question = editText.getText().toString();
                    String show = showResult.getText().toString();

                    if (!question.equals("")) {
                        if (question.endsWith("+") || question.endsWith("-") || question.endsWith("×") || question.endsWith("/"))
                            question = question.substring(0, question.length()-1);

                        try {
                            String questionNew = question.replace("×", "*");

                            Jep jep = new Jep();
                            jep.parse(questionNew);
                            String result = jep.evaluate().toString();

                            result = new BigDecimal(result).setScale(6,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString();

                            editText.setText(result);

                            show = show +"\n" +  question + "=" + result;
                        } catch (Exception e) {
                            editText.setText("Error");
                            show = show + "\n" + question + " = Error";
                        }
                        showResult.setText(show);

                    }
                }
            });

            delete.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String delete = editText.getText().toString();
                    try {
                        editText.setText(delete.substring(0, delete.length() - 1));
                    } catch (Exception e) {
                        editText.setText("");
                    }
                }
            });

            delete.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    editText.setText("");
                    showResult.setText("");
                    return true;
                }
            });

            return rootView;
        }
    }
}
