package quantobusiness.filmcatalog;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button gravityButton=findViewById(R.id.gravityButton);
        Button jumanjiButton=findViewById(R.id.jumanjiButton);
        Button lionKingButton=findViewById(R.id.lionKingButton);
        Button starWarsButton=findViewById(R.id.starWarsButton);
        Button theOriginButton=findViewById(R.id.theOriginButton);
        Button toyStoryButton=findViewById(R.id.toyStoryButton);

        gravityButton.setOnClickListener(this);
        jumanjiButton.setOnClickListener(this);
        lionKingButton.setOnClickListener(this);
        starWarsButton.setOnClickListener(this);
        theOriginButton.setOnClickListener(this);
        toyStoryButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View buttonView) {
        int buttonId=buttonView.getId();
        int imageId;
        switch(buttonId){
            case R.id.gravityButton:
                imageId=R.drawable.rilakkuma2;
                break;
            case R.id.jumanjiButton:
                imageId=R.drawable.jumanji;
                break;
            case R.id.lionKingButton:
                imageId=R.drawable.rilakkuma2;
                break;
            case R.id.starWarsButton:
                imageId=R.drawable.starwars;
                break;
            case R.id.theOriginButton:
                imageId=R.drawable.elorigen;
                break;
            case R.id.toyStoryButton:
                imageId=R.drawable.toystory;
                break;
               default:
               imageId=0;
                    break;

        }
        ImageView  movieImageView=findViewById(R.id.filmImage);

        //movieImageView.setImageDrawable(ContextCompat.getDrawable(this,imageId));
        movieImageView.setImageResource(imageId);


    }
}
