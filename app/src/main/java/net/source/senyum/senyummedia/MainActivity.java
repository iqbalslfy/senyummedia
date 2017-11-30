package net.source.senyum.senyummedia;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import net.source.senyum.senyummedia.activity.KeranjangActivity;
import net.source.senyum.senyummedia.adapter.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    android.support.v7.widget.Toolbar mToolbar;

//    navigation left
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawerLayout = findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        listView = findViewById(R.id.expandable_lv);
        isiData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void isiData() {
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("Stationery");
        listDataHeader.add("Perlengkapan Kantor");
        listDataHeader.add("Peralatan Kantor");
        listDataHeader.add("Kertas");
        listDataHeader.add("Elektronik");
        listDataHeader.add("Buku");
        listDataHeader.add("Peralatan Rumah Tangga");

        List<String> stationery = new ArrayList<>();
        stationery.add("Spidol");
        stationery.add("Gunting");
        stationery.add("Rautan");
        stationery.add("Pensil & Crayon");
        stationery.add("Bolpoin");
        stationery.add("Tipe-x");
        stationery.add("Kuas");
        stationery.add("Jangka");
        stationery.add("Spidol");
        stationery.add("Creativity For Kids");
        stationery.add("Penggaris");
        stationery.add("Lem");
        stationery.add("Penghapus");
        stationery.add("Stabillo");
        stationery.add("Paketan");
        stationery.add("Cat");
        stationery.add("Kompas");
        stationery.add("Cutter");
        stationery.add("Pen Stand");
        stationery.add("Water Colour");
        stationery.add("Amplop");
        stationery.add("Bukti Kas Masuk");
        stationery.add("Loose Leaf");
        stationery.add("Nota");
        stationery.add("Blocnot");
        stationery.add("Zipper Pocket");
        stationery.add("Sheet Protector Bambi");
        stationery.add("Bolpoin Parker");
        stationery.add("Origami");
        stationery.add("Double Tape");
        stationery.add("Post It");
        stationery.add("Kotak Pensil");
        stationery.add("Sampel Buku");

        List<String> perlengkapan_kantor = new ArrayList<>();
        perlengkapan_kantor.add("Map");
        perlengkapan_kantor.add("Ordner");
        perlengkapan_kantor.add("Whiteboard");
        perlengkapan_kantor.add("Clipboard");
        perlengkapan_kantor.add("Box File");
        perlengkapan_kantor.add("Document Keeper");
        perlengkapan_kantor.add("Data Binder");
        perlengkapan_kantor.add("Divider");
        perlengkapan_kantor.add("Computer File");
        perlengkapan_kantor.add("Flexi Tab");
        perlengkapan_kantor.add("Laminated");
        perlengkapan_kantor.add("Insert Iring");
        perlengkapan_kantor.add("Slanted Sign Holder");
        perlengkapan_kantor.add("Stand Up Sign Holder");
        perlengkapan_kantor.add("Name Card Case");
        perlengkapan_kantor.add("Tinta");
        perlengkapan_kantor.add("Binder Clip");
        perlengkapan_kantor.add("Display Book");
        perlengkapan_kantor.add("Memo");
        perlengkapan_kantor.add("Paper Clip");
        perlengkapan_kantor.add("Odner");

        List<String> peralatan_kantor = new ArrayList<>();
        peralatan_kantor.add("Perforator");
        peralatan_kantor.add("Strapler");
        peralatan_kantor.add("Mouse Pad");
        peralatan_kantor.add("Cash Box");
        peralatan_kantor.add("Brangkas");
        peralatan_kantor.add("Pemotong Kertas");
        peralatan_kantor.add("Printer");
        peralatan_kantor.add("Tonner Catridge");
        peralatan_kantor.add("Stapler");
        peralatan_kantor.add("Tape Dispenser");
        peralatan_kantor.add("Nomerator");
        peralatan_kantor.add("Plagban");
        peralatan_kantor.add("Stamp Pad");
        peralatan_kantor.add("Kaca Pembesar");
        peralatan_kantor.add("Remover");
        peralatan_kantor.add("Staples");
        peralatan_kantor.add("Cash Register");

        List<String> kertas = new ArrayList<>();
        kertas.add("HVS");
        kertas.add("Continous");
        kertas.add("Kertas Foto");
        kertas.add("Bufallo");
        kertas.add("Kertas Fax");

        List<String> elektronik = new ArrayList<>();
        elektronik.add("Kalkulator");
        elektronik.add("Catridge");
        elektronik.add("Laser Pointer");

        List<String> buku = new ArrayList<>();
        buku.add("Buku Gambar");
        buku.add("Buku Kwarto");
        buku.add("Buku Folio");
        buku.add("Buku Cek");
        buku.add("Buku Kwitansi");
        buku.add("Buku Bloc Milimeter");
        buku.add("Buku Boxy");
        buku.add("Buku Tulis");
        buku.add("Buku Ekspedisi");
        buku.add("Buku Kas");
        buku.add("Buku Tamu");
        buku.add("Buku Mewarnai");
        buku.add("Buku Diary");
        buku.add("Buku Sketsa");

        List<String> peralatan_rumah_tangga = new ArrayList<>();
        peralatan_rumah_tangga.add("Kotak Kado");

        listHashMap.put(listDataHeader.get(0), stationery);
        listHashMap.put(listDataHeader.get(1), perlengkapan_kantor);
        listHashMap.put(listDataHeader.get(2), peralatan_kantor);
        listHashMap.put(listDataHeader.get(3), elektronik);
        listHashMap.put(listDataHeader.get(4), kertas);
        listHashMap.put(listDataHeader.get(5), buku);
        listHashMap.put(listDataHeader.get(6), peralatan_rumah_tangga);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id = item.getItemId();

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        if (id == R.id.keranjang){
            startActivity(new Intent(getApplicationContext(), KeranjangActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.keranjang, menu);

        return true;
    }
}
