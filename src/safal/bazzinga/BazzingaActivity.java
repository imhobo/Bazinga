package safal.bazzinga;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import safal.buzzinga.R;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;





public class BazzingaActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	 
	 MediaPlayer player;
	 Button pause;
	 
	 
	 
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String i = "Long touch a button for more options...";
  	   Toast.makeText(getApplicationContext(), i,
  	   Toast.LENGTH_LONG).show();
          
        
        
       
        
        Button titbutton ;
        titbutton = (Button)findViewById(R.id.button1);
        titbutton.setOnClickListener(this);
        titbutton.getBackground().setAlpha(180);
        registerForContextMenu(titbutton);
        
        Button bazbutton ;
        bazbutton = (Button)findViewById(R.id.button2);
        bazbutton.setOnClickListener(this);
        bazbutton.getBackground().setAlpha(180);
        registerForContextMenu(bazbutton);
        
        Button spotbutton ;
        spotbutton = (Button)findViewById(R.id.button3);
        spotbutton.setOnClickListener(this);
        spotbutton.getBackground().setAlpha(180);
        registerForContextMenu(spotbutton);
        
        Button howbutton ;
        howbutton = (Button)findViewById(R.id.button4);
        howbutton.setOnClickListener(this);
        howbutton.getBackground().setAlpha(180);
        registerForContextMenu(howbutton);
        
       
        
        
        Button rajbutton ;
        rajbutton = (Button)findViewById(R.id.button5);
        rajbutton.setOnClickListener(this);
        rajbutton.getBackground().setAlpha(180);
        registerForContextMenu(rajbutton);
        
        Button drunkbutton ;
        drunkbutton = (Button)findViewById(R.id.button6);
        drunkbutton.setOnClickListener(this);
        drunkbutton.getBackground().setAlpha(180);
        registerForContextMenu(drunkbutton);
        
        Button knockbutton ;
        knockbutton = (Button)findViewById(R.id.button7);
        knockbutton.setOnClickListener(this);
        knockbutton.getBackground().setAlpha(180);
        registerForContextMenu(knockbutton);
        
        Button laughbutton ;
        laughbutton = (Button)findViewById(R.id.button8);
        laughbutton.setOnClickListener(this);
        laughbutton.getBackground().setAlpha(180);
        registerForContextMenu(laughbutton);
        
        Button kitbutton ;
        kitbutton = (Button)findViewById(R.id.button9);
        kitbutton.setOnClickListener(this);
        kitbutton.getBackground().setAlpha(180);
        registerForContextMenu(kitbutton);
        
        Button endbutton ;
        endbutton = (Button)findViewById(R.id.button10);
        endbutton.setOnClickListener(this);
        endbutton.getBackground().setAlpha(180);
        registerForContextMenu(endbutton);
        
        Button exit;
        exit = (Button)findViewById(R.id.button12);
        exit.setOnClickListener(this);
        
        pause = (Button)findViewById(R.id.button11);
        pause.setOnClickListener(this);
        
        Button spockbutton ;
        spockbutton = (Button)findViewById(R.id.button13);
        spockbutton.setOnClickListener(this);
        spockbutton.getBackground().setAlpha(180);
        registerForContextMenu(spockbutton);
        
        Button swordbutton ;
        swordbutton = (Button)findViewById(R.id.button14);
        swordbutton.setOnClickListener(this);
        swordbutton.getBackground().setAlpha(180);
        registerForContextMenu(swordbutton);
        
        Button howardsongbutton ;
        howardsongbutton = (Button)findViewById(R.id.button15);
        howardsongbutton.setOnClickListener(this);
        howardsongbutton.getBackground().setAlpha(180);
        registerForContextMenu(howardsongbutton);
        
        
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        
        Button two;
        two = (Button)findViewById(R.id.button16);
        two.setOnClickListener(this);
        
        Button three;
        three = (Button)findViewById(R.id.button18);
        three.setOnClickListener(this);
        
        
        
       
        
 
        
        
       
        
        
        
        
        
        
        
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
        if (keyCode == KeyEvent.KEYCODE_BACK )
        {
        	if(player!=null)
			{
			if(player.isPlaying())
			{
				player.stop();}
				player.release();
				player=null;
			}
            
        

        
        super.onKeyDown(keyCode, event);

        return true;}
        
        else
        return false;
        
    }
    
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Set as...");
        menu.add(0, v.getId(), 0, "Ringtone");
        menu.add(0, v.getId(), 0, "Notification");
        menu.add(0, v.getId(), 0, "Alarm Tone");
        }
    
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle()=="Ringtone"){function1(item.getItemId());}
        else if(item.getTitle()=="Notification"){function2(item.getItemId());}
        else if(item.getTitle()=="Alarm Tone"){function3(item.getItemId());}
        
        else {return false;}
    return true;
    }

   
    
	
	
   
	

	boolean function1(int ressound){
		
		String soundname = "";
		
		switch(ressound){
    	case R.id.button1:
    	ressound = R.raw.titletrack;
    	soundname = "Title";
    	break;
    	
    	  
    	   
    	case R.id.button2:
    	ressound = R.raw.bazinga;
    	soundname = "Bazinga";
    	break;
    	
    	
    	
    	  
       	case R.id.button4:
       	ressound = R.raw.howardbeatbox;
       	soundname = "Howard";
       	break;
       	
    	   
	
      	case R.id.button5:
      	ressound = R.raw.rajrock;
      	soundname = "Raj";
      	break;
      	
	
      	case R.id.button6:
      	ressound = R.raw.drunksheldon;
      	soundname = "Drunk";
      	break;
      	
	  
      	case R.id.button7:
      	ressound = R.raw.knockpenny;
      	soundname = "KnockPenny";
      	break;
      	
	   
      	case R.id.button8:
      	ressound = R.raw.sheldonlaugh;
      	soundname = "Laugh";
      	break;
      	
	   
      	case R.id.button9:
      	ressound = R.raw.softkitty;
      	soundname = "Softkitty";
      	break;
      	
	
      	case R.id.button10:
      	ressound = R.raw.ending;
      	soundname = "Ending";
      	break;
      	
      	case R.id.button13:
        	ressound = R.raw.spock;
        	soundname = "Spock";
        	break;
        	
      	case R.id.button14:
        	ressound = R.raw.sword;
        	soundname = "Swordmaster";
        	break;
        	
      	case R.id.button15:
        	ressound = R.raw.howsong;
        	soundname = "Howard's Song";
        	break;
        	
      	case R.id.button3:
        	ressound = R.raw.spot;
        	soundname = "Spot";
        	break;
        	
      	case R.id.button19:
        	ressound = R.raw.bestone;
        	soundname = "best";
        	break;
        	
      	case R.id.button20:
        	ressound = R.raw.chess;
        	soundname = "chess";
        	break;
        	
      	case R.id.button21:
        	ressound = R.raw.flash;
        	soundname = "flash";
        	break;
        	
      	case R.id.button22:
        	ressound = R.raw.gift;
        	soundname = "gift";
        	break;
        	
      	case R.id.button23:
        	ressound = R.raw.halo;
        	soundname = "halo";
        	break;
        	
      	case R.id.button24:
        	ressound = R.raw.ificud;
        	soundname = "ificud";
        	break;
        	
      	case R.id.button25:
        	ressound = R.raw.insane;
        	soundname = "insane";
        	break;
        	
      	case R.id.button26:
        	ressound = R.raw.jibber;
        	soundname = "jibber";
        	break;
        	
      	case R.id.button27:
        	ressound = R.raw.mammal;
        	soundname = "mammal";
        	break;
        	
      	case R.id.button28:
        	ressound = R.raw.mandarin;
        	soundname = "mandarin";
        	break;
        	
      	case R.id.button29:
        	ressound = R.raw.muah;
        	soundname = "muah";
        	break;
        	
      	case R.id.button30:
        	ressound = R.raw.nerd;
        	soundname = "nerd";
        	break;
        	
      	case R.id.button31:
        	ressound = R.raw.onlycare;
        	soundname = "onlycare";
        	break;
        	
      	case R.id.button32:
        	ressound = R.raw.ravishng;
        	soundname = "ravishng";
        	break;
        	
      	case R.id.button33:
        	ressound = R.raw.reject;
        	soundname = "reject";
        	break;
        	
      	case R.id.button34:
        	ressound = R.raw.seepenny;
        	soundname = "Seepenny";
        	break;
        	
      	case R.id.button35:
        	ressound = R.raw.shutup;
        	soundname = "Shutup";
        	break;
        	
      	case R.id.button36:
        	ressound = R.raw.thephone;
        	soundname = "Thephone";
        	break;
        	
      	case R.id.button37:
        	ressound = R.raw.ungodly;
        	soundname = "Ungodly";
        	break;
        	
      	case R.id.button38:
        	ressound = R.raw.virgin;
        	soundname = "virgin";
        	break;
        	
      	case R.id.button39:
        	ressound = R.raw.vista;
        	soundname = "vista";
        	break;
        	
      	case R.id.button40:
        	ressound = R.raw.knockshel;
        	soundname = "KnockSheldon";
        	break;
        	
      	case R.id.button41:
        	ressound = R.raw.wow;
        	soundname = "wow";
        	break;
        	
      	case R.id.button42:
        	ressound = R.raw.cmplicatd;
        	soundname = "Complicated";
        	break;
        	
      	case R.id.button43:
        	ressound = R.raw.things;
        	soundname = "Things";
        	break;
        	
      	case R.id.button44:
        	ressound = R.raw.god;
        	soundname = "God";
        	break;
      	
        	     	
      	
		}
      	
		
		
        byte[] buffer=null;
        InputStream fIn = getBaseContext().getResources().openRawResource(ressound);
        int size=0;

        try {
         size = fIn.available();
         buffer = new byte[size];
         fIn.read(buffer);
         fIn.close();
        } catch (IOException e) {
         // TODO Auto-generated catch block
         return false;
        }

        
        String path=Environment.getExternalStorageDirectory().getPath()+"/media/audio/ringtones/";
        String filename=soundname+".mp3"; 

        boolean exists = (new File(path)).exists();
        if (!exists){new File(path).mkdirs();}

        FileOutputStream save;
        try {
         save = new FileOutputStream(path+filename);
         save.write(buffer);
         save.flush();
         save.close();
        } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         return false;
        } catch (IOException e) {
         // TODO Auto-generated catch block
         return false;
        }    

        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"+path+filename)));

        File k = new File(path, filename);

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, soundname);
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
        values.put(MediaStore.Audio.Media.IS_ALARM, false);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        Uri uri = MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath());
        getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + k.getAbsolutePath() + "\"", null);
        Uri newUri = getContentResolver().insert(uri, values); 
        RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_RINGTONE, newUri);
        
        String i = "Saved as Ringtone.";
 	   Toast.makeText(getApplicationContext(), i,
 	   Toast.LENGTH_LONG).show();

        return false;}
	
	boolean function2(int ressound){
		
		String soundname = "";
		
		switch(ressound){
    	case R.id.button1:
    	ressound = R.raw.titletrack;
    	soundname = "Title";
    	break;
    	
    	  
    	
    	case R.id.button2:
    	ressound = R.raw.bazinga;
    	soundname = "Bazinga";
    	break;
    	
    	  
       	case R.id.button4:
       	ressound = R.raw.howardbeatbox;
       	soundname = "Howard";
       	break;
       	
    	   
	  
      	case R.id.button5:
      	ressound = R.raw.rajrock;
      	soundname = "Raj";
      	break;
      	
	   
      	case R.id.button6:
      	ressound = R.raw.drunksheldon;
      	soundname = "Drunk";
      	break;
      	
	  
      	case R.id.button7:
      	ressound = R.raw.knockpenny;
      	soundname = "KnockPenny";
      	break;
      	
	 
      	case R.id.button8:
      	ressound = R.raw.sheldonlaugh;
      	soundname = "Laugh";
      	break;
      	
	   
      	case R.id.button9:
      	ressound = R.raw.softkitty;
      	soundname = "Softkitty";
      	break;
      	
	   
      	case R.id.button10:
      	ressound = R.raw.ending;
      	soundname = "Ending";
      	break;
      	
      	case R.id.button13:
        	ressound = R.raw.spock;
        	soundname = "Spock";
        	break;
        	
      	case R.id.button14:
        	ressound = R.raw.sword;
        	soundname = "Swordmaster";
        	break;
        	
      	case R.id.button15:
        	ressound = R.raw.howsong;
        	soundname = "Howard's Song";
        	break;
        	
      	case R.id.button3:
        	ressound = R.raw.spot;
        	soundname = "Spot";
        	break;
      	
      	case R.id.button19:
        	ressound = R.raw.bestone;
        	soundname = "best";
        	break;
        	
      	case R.id.button20:
        	ressound = R.raw.chess;
        	soundname = "chess";
        	break;
        	
      	case R.id.button21:
        	ressound = R.raw.flash;
        	soundname = "flash";
        	break;
        	
      	case R.id.button22:
        	ressound = R.raw.gift;
        	soundname = "gift";
        	break;
        	
      	case R.id.button23:
        	ressound = R.raw.halo;
        	soundname = "halo";
        	break;
        	
      	case R.id.button24:
        	ressound = R.raw.ificud;
        	soundname = "ificud";
        	break;
        	
      	case R.id.button25:
        	ressound = R.raw.insane;
        	soundname = "insane";
        	break;
        	
      	case R.id.button26:
        	ressound = R.raw.jibber;
        	soundname = "jibber";
        	break;
        	
      	case R.id.button27:
        	ressound = R.raw.mammal;
        	soundname = "mammal";
        	break;
        	
      	case R.id.button28:
        	ressound = R.raw.mandarin;
        	soundname = "mandarin";
        	break;
        	
      	case R.id.button29:
        	ressound = R.raw.muah;
        	soundname = "muah";
        	break;
        	
      	case R.id.button30:
        	ressound = R.raw.nerd;
        	soundname = "nerd";
        	break;
        	
      	case R.id.button31:
        	ressound = R.raw.onlycare;
        	soundname = "onlycare";
        	break;
        	
      	case R.id.button32:
        	ressound = R.raw.ravishng;
        	soundname = "ravishng";
        	break;
        	
      	case R.id.button33:
        	ressound = R.raw.reject;
        	soundname = "reject";
        	break;
        	
      	case R.id.button34:
        	ressound = R.raw.seepenny;
        	soundname = "Seepenny";
        	break;
        	
      	case R.id.button35:
        	ressound = R.raw.shutup;
        	soundname = "Shutup";
        	break;
        	
      	case R.id.button36:
        	ressound = R.raw.thephone;
        	soundname = "Thephone";
        	break;
        	
      	case R.id.button37:
        	ressound = R.raw.ungodly;
        	soundname = "Ungodly";
        	break;
        	
      	case R.id.button38:
        	ressound = R.raw.virgin;
        	soundname = "virgin";
        	break;
        	
      	case R.id.button39:
        	ressound = R.raw.vista;
        	soundname = "vista";
        	break;
        	
      	case R.id.button40:
        	ressound = R.raw.knockshel;
        	soundname = "KnockSheldon";
        	break;
        	
      	case R.id.button41:
        	ressound = R.raw.wow;
        	soundname = "wow";
        	break;
        	
      	case R.id.button42:
        	ressound = R.raw.cmplicatd;
        	soundname = "Complicated";
        	break;
        	
      	case R.id.button43:
        	ressound = R.raw.things;
        	soundname = "Things";
        	break;
        	
      	case R.id.button44:
        	ressound = R.raw.god;
        	soundname = "God";
        	break;
        	
		}
		
		
        byte[] buffer=null;
        InputStream fIn = getBaseContext().getResources().openRawResource(ressound);
        int size=0;

        try {
         size = fIn.available();
         buffer = new byte[size];
         fIn.read(buffer);
         fIn.close();
        } catch (IOException e) {
         // TODO Auto-generated catch block
         return false;
        }

        
        String path=Environment.getExternalStorageDirectory().getPath()+"/media/audio/notifications/";
        String filename=soundname+".mp3"; 

        boolean exists = (new File(path)).exists();
        if (!exists){new File(path).mkdirs();}

        FileOutputStream save;
        try {
         save = new FileOutputStream(path+filename);
         save.write(buffer);
         save.flush();
         save.close();
        } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         return false;
        } catch (IOException e) {
         // TODO Auto-generated catch block
         return false;
        }    

        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"+path+filename)));

        File k = new File(path, filename);

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, soundname);
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
        values.put(MediaStore.Audio.Media.IS_ALARM, false);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        Uri uri = MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath());
        getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + k.getAbsolutePath() + "\"", null);
        Uri newUri = getContentResolver().insert(uri, values); 
        RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_NOTIFICATION, newUri);
        
        String i = "Saved as Notification.";
 	   Toast.makeText(getApplicationContext(), i,
 	   Toast.LENGTH_LONG).show();
       

        return false;}
    
	boolean function3(int ressound){
		
		String soundname = "";
		
		switch(ressound){
    	case R.id.button1:
    	ressound = R.raw.titletrack;
    	soundname = "Title";
    	break;
    	
    	  
    	   
    	case R.id.button2:
    	ressound = R.raw.bazinga;
    	soundname = "Bazinga";
    	break;
    	
    	   
       	case R.id.button4:
       	ressound = R.raw.howardbeatbox;
       	soundname = "Howard";
       	break;
       	
    	   
	   
      	case R.id.button5:
      	ressound = R.raw.rajrock;
      	soundname = "Raj";
      	break;
      	
	  
      	case R.id.button6:
      	ressound = R.raw.drunksheldon;
      	soundname = "Drunk";
      	break;
      	
	   
      	case R.id.button7:
      	ressound = R.raw.knockpenny;
      	soundname = "KnockPenny";
      	break;
      	
	  
      	case R.id.button8:
      	ressound = R.raw.sheldonlaugh;
      	soundname = "Laugh";
      	break;
      	
	  
      	case R.id.button9:
      	ressound = R.raw.softkitty;
      	soundname = "Softkitty";
      	break;
      	
	  
      	case R.id.button10:
      	ressound = R.raw.ending;
      	soundname = "Ending";
      	break;
      	
      	case R.id.button13:
        	ressound = R.raw.spock;
        	soundname = "Spock";
        	break;
        	
      	case R.id.button14:
        	ressound = R.raw.sword;
        	soundname = "Swordmaster";
        	break;
        	
      	case R.id.button15:
        	ressound = R.raw.howsong;
        	soundname = "Howard's Song";
        	break;
        	
      	case R.id.button3:
        	ressound = R.raw.spot;
        	soundname = "Spot";
        	break;
        	
      	case R.id.button19:
        	ressound = R.raw.bestone;
        	soundname = "best";
        	break;
        	
      	case R.id.button20:
        	ressound = R.raw.chess;
        	soundname = "chess";
        	break;
        	
      	case R.id.button21:
        	ressound = R.raw.flash;
        	soundname = "flash";
        	break;
        	
      	case R.id.button22:
        	ressound = R.raw.gift;
        	soundname = "gift";
        	break;
        	
      	case R.id.button23:
        	ressound = R.raw.halo;
        	soundname = "halo";
        	break;
        	
      	case R.id.button24:
        	ressound = R.raw.ificud;
        	soundname = "ificud";
        	break;
        	
      	case R.id.button25:
        	ressound = R.raw.insane;
        	soundname = "insane";
        	break;
        	
      	case R.id.button26:
        	ressound = R.raw.jibber;
        	soundname = "jibber";
        	break;
        	
      	case R.id.button27:
        	ressound = R.raw.mammal;
        	soundname = "mammal";
        	break;
        	
      	case R.id.button28:
        	ressound = R.raw.mandarin;
        	soundname = "mandarin";
        	break;
        	
      	case R.id.button29:
        	ressound = R.raw.muah;
        	soundname = "muah";
        	break;
        	
      	case R.id.button30:
        	ressound = R.raw.nerd;
        	soundname = "nerd";
        	break;
        	
      	case R.id.button31:
        	ressound = R.raw.onlycare;
        	soundname = "onlycare";
        	break;
        	
      	case R.id.button32:
        	ressound = R.raw.ravishng;
        	soundname = "ravishng";
        	break;
        	
      	case R.id.button33:
        	ressound = R.raw.reject;
        	soundname = "reject";
        	break;
        	
      	case R.id.button34:
        	ressound = R.raw.seepenny;
        	soundname = "Seepenny";
        	break;
        	
      	case R.id.button35:
        	ressound = R.raw.shutup;
        	soundname = "Shutup";
        	break;
        	
      	case R.id.button36:
        	ressound = R.raw.thephone;
        	soundname = "Thephone";
        	break;
        	
      	case R.id.button37:
        	ressound = R.raw.ungodly;
        	soundname = "Ungodly";
        	break;
        	
      	case R.id.button38:
        	ressound = R.raw.virgin;
        	soundname = "virgin";
        	break;
        	
      	case R.id.button39:
        	ressound = R.raw.vista;
        	soundname = "vista";
        	break;
        	
      	case R.id.button40:
        	ressound = R.raw.knockshel;
        	soundname = "KnockSheldon";
        	break;
        	
      	case R.id.button41:
        	ressound = R.raw.wow;
        	soundname = "wow";
        	break;
        	
      	case R.id.button42:
        	ressound = R.raw.cmplicatd;
        	soundname = "Complicated";
        	break;
        	
      	case R.id.button43:
        	ressound = R.raw.things;
        	soundname = "Things";
        	break;
        	
      	case R.id.button44:
        	ressound = R.raw.god;
        	soundname = "God";
        	break;
        	
      	
		}
		
		
        byte[] buffer=null;
        InputStream fIn = getBaseContext().getResources().openRawResource(ressound);
        int size=0;

        try {
         size = fIn.available();
         buffer = new byte[size];
         fIn.read(buffer);
         fIn.close();
        } catch (IOException e) {
         // TODO Auto-generated catch block
         return false;
        }

        
        String path=Environment.getExternalStorageDirectory().getPath()+"/media/audio/alarmtones/";
        String filename=soundname+".mp3"; 

        boolean exists = (new File(path)).exists();
        if (!exists){new File(path).mkdirs();}

        FileOutputStream save;
        try {
         save = new FileOutputStream(path+filename);
         save.write(buffer);
         save.flush();
         save.close();
        } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         return false;
        } catch (IOException e) {
         // TODO Auto-generated catch block
         return false;
        }    

        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"+path+filename)));

        File k = new File(path, filename);

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, soundname);
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
        values.put(MediaStore.Audio.Media.IS_ALARM, true);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        Uri uri = MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath());
        getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + k.getAbsolutePath() + "\"", null);
        Uri newUri = getContentResolver().insert(uri, values); 
        RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_ALARM, newUri);
        
        String i = "Saved as Alarm Tone.";
 	   Toast.makeText(getApplicationContext(), i,
 	   Toast.LENGTH_LONG).show();

        return false;}
    
    
    
    
    
    
    
    
    
    

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			
			if(player!=null)
			{
			if(player.isPlaying())
			{
				player.stop();}
				player.release();
				player=null;
			}
			player = MediaPlayer.create(this,R.raw.titletrack);
			player.start();
		
			
			
			
			
		
			
			break;
			
		case R.id.button11:
			if(player!=null)
			{
			if(player.isPlaying())
			{
				player.stop();}
				player.release();
				player=null;
			}
			
			break;
			
		case R.id.button2:
			
			if(player!=null)
			{
			if(player.isPlaying())
			{
				player.stop();}
				player.release();
				player=null;
			}
			player = MediaPlayer.create(this,R.raw.bazinga);
			player.start();
			
			
			break;
			
case R.id.button3:
			
			if(player!=null)
			{
			if(player.isPlaying())
			{
				player.stop();}
				player.release();
				player=null;
			}
			player = MediaPlayer.create(this,R.raw.spot);
			player.start();
			
			
			break;
			
		
			
		case R.id.button4:
			if(player!=null)
			{
			if(player.isPlaying())
			{
				player.stop();}
				player.release();
				player=null;
			}
			player = MediaPlayer.create(this,R.raw.howardbeatbox);
			player.start();
			
			
			break;
			
case R.id.button5:
			
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
			player = MediaPlayer.create(this,R.raw.rajrock);
			player.start();
			break;
			

case R.id.button6:
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.drunksheldon);
	player.start();
	break;
	
case R.id.button7:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.knockpenny);
	player.start();
	
	
	break;
	
case R.id.button8:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.sheldonlaugh);
	player.start();
	
	
	break;
	
case R.id.button9:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.softkitty);
	player.start();
	
	break;
	
case R.id.button10:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.ending);
	player.start();
	
	break;
	
case R.id.button13:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.spock);
	player.start();
	
	
	break;
	
case R.id.button14:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.sword);
	player.start();
	
	
	break;
	
case R.id.button15:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.howsong);
	player.start();
	
	
	break;
	
case R.id.button16:
	
	ScrollView layout = (ScrollView)findViewById(R.id.ScrollView02);
	layout.removeAllViews();
	
	LayoutInflater inflater = getLayoutInflater();
	layout.addView(inflater.inflate(R.layout.page2, null));
	
	Button one;
    one = (Button)findViewById(R.id.button17);
    one.setOnClickListener(this);
	
    
    Button three;
    three = (Button)findViewById(R.id.button18);
    three.setOnClickListener(this);
    
    Button bestbutton ;
    bestbutton = (Button)findViewById(R.id.button19);
    bestbutton.setOnClickListener(this);
    bestbutton.getBackground().setAlpha(180);
    registerForContextMenu(bestbutton);
    
    Button chessbutton ;
    chessbutton = (Button)findViewById(R.id.button20);
    chessbutton.setOnClickListener(this);
    chessbutton.getBackground().setAlpha(180);
    registerForContextMenu(chessbutton);
    
    Button flashbutton ;
    flashbutton = (Button)findViewById(R.id.button21);
    flashbutton.setOnClickListener(this);
    flashbutton.getBackground().setAlpha(180);
    registerForContextMenu(flashbutton);
    
    Button giftbutton ;
    giftbutton = (Button)findViewById(R.id.button22);
    giftbutton.setOnClickListener(this);
    giftbutton.getBackground().setAlpha(180);
    registerForContextMenu(giftbutton);
    
   
    
    
    Button halobutton ;
    halobutton = (Button)findViewById(R.id.button23);
    halobutton.setOnClickListener(this);
    halobutton.getBackground().setAlpha(180);
    registerForContextMenu(halobutton);
    
    Button ifbutton ;
    ifbutton = (Button)findViewById(R.id.button24);
    ifbutton.setOnClickListener(this);
    ifbutton.getBackground().setAlpha(180);
    registerForContextMenu(ifbutton);
    
    Button inbutton ;
    inbutton = (Button)findViewById(R.id.button25);
    inbutton.setOnClickListener(this);
    inbutton.getBackground().setAlpha(180);
    registerForContextMenu(inbutton);
    
    Button jibbutton ;
    jibbutton = (Button)findViewById(R.id.button26);
    jibbutton.setOnClickListener(this);
    jibbutton.getBackground().setAlpha(180);
    registerForContextMenu(jibbutton);
    
    Button mambutton ;
    mambutton = (Button)findViewById(R.id.button27);
    mambutton.setOnClickListener(this);
    mambutton.getBackground().setAlpha(180);
    registerForContextMenu(mambutton);
    
    Button manbutton ;
    manbutton = (Button)findViewById(R.id.button28);
    manbutton.setOnClickListener(this);
    manbutton.getBackground().setAlpha(180);
    registerForContextMenu(manbutton);
    
    Button exit1;
    exit1 = (Button)findViewById(R.id.button12);
    exit1.setOnClickListener(this);
    
    pause = (Button)findViewById(R.id.button11);
    pause.setOnClickListener(this);
    
    Button muahbutton ;
    muahbutton = (Button)findViewById(R.id.button29);
    muahbutton.setOnClickListener(this);
    muahbutton.getBackground().setAlpha(180);
    registerForContextMenu(muahbutton);
    
    Button nerdbutton ;
    nerdbutton = (Button)findViewById(R.id.button30);
    nerdbutton.setOnClickListener(this);
    nerdbutton.getBackground().setAlpha(180);
    registerForContextMenu(nerdbutton);
    
    Button carebutton ;
    carebutton = (Button)findViewById(R.id.button31);
    carebutton.setOnClickListener(this);
    carebutton.getBackground().setAlpha(180);
    registerForContextMenu(carebutton);
    
	
	break;
	
case R.id.button17:
	
	ScrollView layout3 = (ScrollView)findViewById(R.id.ScrollView02);
	layout3.removeAllViews();
	
	LayoutInflater inflater3 = getLayoutInflater();
	layout3.addView(inflater3.inflate(R.layout.main, null));
	
	Button two;
    two = (Button)findViewById(R.id.button16);
    two.setOnClickListener(this);
    
    Button threethree;
    threethree = (Button)findViewById(R.id.button18);
    threethree.setOnClickListener(this);
    
    Button titbutton ;
    titbutton = (Button)findViewById(R.id.button1);
    titbutton.setOnClickListener(this);
    titbutton.getBackground().setAlpha(180);
    registerForContextMenu(titbutton);
    
    Button bazbutton ;
    bazbutton = (Button)findViewById(R.id.button2);
    bazbutton.setOnClickListener(this);
    bazbutton.getBackground().setAlpha(180);
    registerForContextMenu(bazbutton);
    
    Button spotbutton ;
    spotbutton = (Button)findViewById(R.id.button3);
    spotbutton.setOnClickListener(this);
    spotbutton.getBackground().setAlpha(180);
    registerForContextMenu(spotbutton);
    
    Button howbutton ;
    howbutton = (Button)findViewById(R.id.button4);
    howbutton.setOnClickListener(this);
    howbutton.getBackground().setAlpha(180);
    registerForContextMenu(howbutton);
    
   
    
    
    Button rajbutton ;
    rajbutton = (Button)findViewById(R.id.button5);
    rajbutton.setOnClickListener(this);
    rajbutton.getBackground().setAlpha(180);
    registerForContextMenu(rajbutton);
    
    Button drunkbutton ;
    drunkbutton = (Button)findViewById(R.id.button6);
    drunkbutton.setOnClickListener(this);
    drunkbutton.getBackground().setAlpha(180);
    registerForContextMenu(drunkbutton);
    
    Button knockbutton ;
    knockbutton = (Button)findViewById(R.id.button7);
    knockbutton.setOnClickListener(this);
    knockbutton.getBackground().setAlpha(180);
    registerForContextMenu(knockbutton);
    
    Button laughbutton ;
    laughbutton = (Button)findViewById(R.id.button8);
    laughbutton.setOnClickListener(this);
    laughbutton.getBackground().setAlpha(180);
    registerForContextMenu(laughbutton);
    
    Button kitbutton ;
    kitbutton = (Button)findViewById(R.id.button9);
    kitbutton.setOnClickListener(this);
    kitbutton.getBackground().setAlpha(180);
    registerForContextMenu(kitbutton);
    
    Button endbutton ;
    endbutton = (Button)findViewById(R.id.button10);
    endbutton.setOnClickListener(this);
    endbutton.getBackground().setAlpha(180);
    registerForContextMenu(endbutton);
    
    Button exit;
    exit = (Button)findViewById(R.id.button12);
    exit.setOnClickListener(this);
    
    pause = (Button)findViewById(R.id.button11);
    pause.setOnClickListener(this);
    
    Button spockbutton ;
    spockbutton = (Button)findViewById(R.id.button13);
    spockbutton.setOnClickListener(this);
    spockbutton.getBackground().setAlpha(180);
    registerForContextMenu(spockbutton);
    
    Button swordbutton ;
    swordbutton = (Button)findViewById(R.id.button14);
    swordbutton.setOnClickListener(this);
    swordbutton.getBackground().setAlpha(180);
    registerForContextMenu(swordbutton);
    
    Button howardsongbutton ;
    howardsongbutton = (Button)findViewById(R.id.button15);
    howardsongbutton.setOnClickListener(this);
    howardsongbutton.getBackground().setAlpha(180);
    registerForContextMenu(howardsongbutton);
    
    
    break;
	
case R.id.button18:
	
	ScrollView layout2 = (ScrollView)findViewById(R.id.ScrollView02);
	layout2.removeAllViews();
	
	LayoutInflater inflater2 = getLayoutInflater();
	layout2.addView(inflater2.inflate(R.layout.page3, null));
	
	Button oneone;
    oneone = (Button)findViewById(R.id.button17);
    oneone.setOnClickListener(this);

	
	Button twotwo;
    twotwo = (Button)findViewById(R.id.button16);
    twotwo.setOnClickListener(this);
    
    Button ravbutton ;
    ravbutton = (Button)findViewById(R.id.button32);
    ravbutton.setOnClickListener(this);
    ravbutton.getBackground().setAlpha(180);
    registerForContextMenu(ravbutton);
    
    Button rejbutton ;
    rejbutton = (Button)findViewById(R.id.button33);
    rejbutton.setOnClickListener(this);
    rejbutton.getBackground().setAlpha(180);
    registerForContextMenu(rejbutton);
    
   
    
    
    Button seebutton ;
    seebutton = (Button)findViewById(R.id.button34);
    seebutton.setOnClickListener(this);
    seebutton.getBackground().setAlpha(180);
    registerForContextMenu(seebutton);
    
    Button shutbutton ;
    shutbutton = (Button)findViewById(R.id.button35);
    shutbutton.setOnClickListener(this);
    shutbutton.getBackground().setAlpha(180);
    registerForContextMenu(shutbutton);
    
    Button phobutton ;
    phobutton = (Button)findViewById(R.id.button36);
    phobutton.setOnClickListener(this);
    phobutton.getBackground().setAlpha(180);
    registerForContextMenu(phobutton);
    
    Button godbutton ;
    godbutton = (Button)findViewById(R.id.button37);
    godbutton.setOnClickListener(this);
    godbutton.getBackground().setAlpha(180);
    registerForContextMenu(godbutton);
    
    Button virbutton ;
    virbutton = (Button)findViewById(R.id.button38);
    virbutton.setOnClickListener(this);
    virbutton.getBackground().setAlpha(180);
    registerForContextMenu(virbutton);
    
    Button visbutton ;
    visbutton = (Button)findViewById(R.id.button39);
    visbutton.setOnClickListener(this);
    visbutton.getBackground().setAlpha(180);
    registerForContextMenu(visbutton);
    
    Button exit2;
    exit2 = (Button)findViewById(R.id.button12);
    exit2.setOnClickListener(this);
    
    pause = (Button)findViewById(R.id.button11);
    pause.setOnClickListener(this);
    
    Button shelbutton ;
    shelbutton = (Button)findViewById(R.id.button40);
    shelbutton.setOnClickListener(this);
    shelbutton.getBackground().setAlpha(180);
    registerForContextMenu(shelbutton);
    
    Button wowbutton ;
    wowbutton = (Button)findViewById(R.id.button41);
    wowbutton.setOnClickListener(this);
    wowbutton.getBackground().setAlpha(180);
    registerForContextMenu(wowbutton);
    
    Button cmpbutton ;
    cmpbutton = (Button)findViewById(R.id.button42);
    cmpbutton.setOnClickListener(this);
    cmpbutton.getBackground().setAlpha(180);
    registerForContextMenu(cmpbutton);
    
    Button thnbutton ;
    thnbutton = (Button)findViewById(R.id.button43);
    thnbutton.setOnClickListener(this);
    thnbutton.getBackground().setAlpha(180);
    registerForContextMenu(thnbutton);
    
    Button god1button ;
    god1button = (Button)findViewById(R.id.button44);
    god1button.setOnClickListener(this);
    god1button.getBackground().setAlpha(180);
    registerForContextMenu(god1button);
    
    
	
	break;
	
    
    
case R.id.button19:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.bestone);
	player.start();
	
	break;
	
case R.id.button20:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.chess);
	player.start();
	
	break;
	
case R.id.button21:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.flash);
	player.start();
	
	break;
	
case R.id.button22:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.gift);
	player.start();
	
	break;
	
case R.id.button23:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.halo);
	player.start();
	
	break;
	
case R.id.button24:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.ificud);
	player.start();
	
	break;
	
case R.id.button25:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.insane);
	player.start();
	
	break;
	
case R.id.button26:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.jibber);
	player.start();
	
	break;
	
case R.id.button27:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.mammal);
	player.start();
	
	break;
	
case R.id.button28:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.mandarin);
	player.start();
	
	break;
	
case R.id.button29:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.muah);
	player.start();
	
	break;
	
case R.id.button30:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.nerd);
	player.start();
	
	break;
	
case R.id.button31:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.onlycare);
	player.start();
	
	break;
	
case R.id.button32:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.ravishng);
	player.start();
	
	break;
	
case R.id.button33:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.reject);
	player.start();
	
	break;
	
case R.id.button34:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.seepenny);
	player.start();
	
	break;
	
case R.id.button35:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.shutup);
	player.start();
	
	break;
	
case R.id.button36:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.thephone);
	player.start();
	
	break;
	
case R.id.button37:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.ungodly);
	player.start();
	
	break;
	
case R.id.button38:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.virgin);
	player.start();
	
	break;
	
case R.id.button39:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.vista);
	player.start();
	
	break;
	
case R.id.button40:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.knockshel);
	player.start();
	
	break;
	
case R.id.button41:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.wow);
	player.start();
	
	break;
	
case R.id.button42:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.cmplicatd);
	player.start();
	
	break;
	
case R.id.button43:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.things);
	player.start();
	
	break;
	
case R.id.button44:
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	player = MediaPlayer.create(this,R.raw.god);
	player.start();
	
	break;
	
case R.id.button12:
	
	
	if(player!=null)
	{
	if(player.isPlaying())
	{
		player.stop();}
		player.release();
		player=null;
	}
	
	finish();
	
	
	
			
			
			
			
		
		
}
	}
	
	
	







}