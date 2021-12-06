package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MomGift extends AppCompatActivity {
    private final LinkedList<String> name = new LinkedList<>();
    private final LinkedList<String> description = new LinkedList<>();
    private final LinkedList<Integer> links = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom_gift);

        name.add("Tote Bag");
        name.add("Running Headphones");
        name.add("Meaningful Bracelet");
        name.add("Essential Oils");
        name.add("Scented Candle");

        description.add("For many moms, a handbag is less an accessory than a utilitarian carryall, toting everything they could possibly need in a day: Band-Aids, sunscreen, extra hair ties, a bottle of water, and sometimes even an emergency PB&J. This year, upgrade your own mom’s go-everywhere, do-everything bag to the Cuyana Classic Structured Leather Tote, one of Wirecutter’s favorite tote bags. It’s large enough to hold water bottles or a bag of string cheese, all while still looking chic. Take this gift a step further by adding a Cuyana Tote Organization Insert.");
        description.add("Whether your mom dreams of Olympic glory or just likes to jog around the block, you can help her make the miles pass more smoothly with a pair of Jabra Elite Active 75t, the best running headphones we’ve found for someone who wants to block external noise (with the option of letting it in when necessary). The Jabras have great sound, solid battery life, a durable build, a secure fit, and easy-to-use controls, all of which will make your mom’s run as pleasurable as possible. And they’re protected against dust and sweat, so they’ll endure even the most intense workouts.");
        description.add("Affordable and understated, these custom bracelets feature a dainty silver or gold chain of varying lengths to perfectly fit your recipient’s wrist size. You can get the bracelet with just one gem—maybe your mom’s birthstone, or perhaps a stone in her favorite color. My grandmother wears all of her grandkids’ birthstones on one chain, an idea that’s easy to replicate (and easy to split with your siblings, for a lot of kids). If you don’t know your recipient’s wrist size, you may be able to figure it out by measuring a bracelet or watch she already owns.");
        description.add("Stock her up with everything she needs to sleep well while traveling and keep her energy up on long, busy days away from home. The Pili Ani Essential Oil Travel Set contains five special blends of essential oils to help Mom start and end her day. ");
        description.add("You might not be able to treat Mom to a spa day this spring, so bring the experience to her with a tranquility-promoting scented candle. The Lifetherapy Grounded 75hr Burn Time Soy Candle features notes of fresh citrus to clear the mind, heliotrope to create balance, dry amber to combat anxiety, rose to boost mood, and vanilla to calm the senses. Bonus:  The soy wax is sourced in the United States, and the candle is housed in a chic reusable glass jar.");

        links.add(R.drawable.tote);
        links.add(R.drawable.headphones);
        links.add(R.drawable.bracelet);
        links.add(R.drawable.oils);
        links.add(R.drawable.candle);


        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new GiftAdapter(this, name, description, links);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}