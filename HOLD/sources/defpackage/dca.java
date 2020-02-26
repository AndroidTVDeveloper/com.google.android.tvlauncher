package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: dca  reason: default package */
/* compiled from: PG */
final class dca extends AsyncTask {
    private dce a;
    private final ContentResolver b;
    private final /* synthetic */ dcc c;

    public dca(dcc dcc, Context context) {
        this.c = dcc;
        this.b = context.getContentResolver();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        boolean z = false;
        try {
            InputStream openInputStream = this.b.openInputStream(this.c.h);
            if (openInputStream == null) {
                String valueOf = String.valueOf(this.c.h);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Error opening ");
                sb.append(valueOf);
                Log.e("OemAppPromotions", sb.toString());
            } else {
                Context context = this.c.g;
                if (dcf.b == null) {
                    synchronized (dcf.class) {
                        if (dcf.b == null) {
                            dcf.a.put("art_and_design", context.getString(R.string.category_art_and_design));
                            dcf.a.put("auto_and_vehicles", context.getString(R.string.category_auto_and_vehicles));
                            dcf.a.put("beauty", context.getString(R.string.category_beauty));
                            dcf.a.put("books_and_reference", context.getString(R.string.category_books_and_reference));
                            dcf.a.put("business", context.getString(R.string.category_business));
                            dcf.a.put("comics", context.getString(R.string.category_comics));
                            dcf.a.put("communication", context.getString(R.string.category_communication));
                            dcf.a.put("dating", context.getString(R.string.category_dating));
                            dcf.a.put("education", context.getString(R.string.category_education));
                            dcf.a.put("entertainment", context.getString(R.string.category_entertainment));
                            dcf.a.put("events", context.getString(R.string.category_events));
                            dcf.a.put("finance", context.getString(R.string.category_finance));
                            dcf.a.put("food_and_drink", context.getString(R.string.category_food_and_drink));
                            dcf.a.put("health_and_fitness", context.getString(R.string.category_health_and_fitness));
                            dcf.a.put("house_and_home", context.getString(R.string.category_house_and_home));
                            dcf.a.put("lifestyle", context.getString(R.string.category_lifestyle));
                            dcf.a.put("maps_and_navigation", context.getString(R.string.category_maps_and_navigation));
                            dcf.a.put("medical", context.getString(R.string.category_medical));
                            dcf.a.put("music_and_audio", context.getString(R.string.category_music_and_audio));
                            dcf.a.put("news_and_magazines", context.getString(R.string.category_news_and_magazines));
                            dcf.a.put("parenting", context.getString(R.string.category_parenting));
                            dcf.a.put("personalization", context.getString(R.string.category_personalization));
                            dcf.a.put("photography", context.getString(R.string.category_photography));
                            dcf.a.put("productivity", context.getString(R.string.category_productivity));
                            dcf.a.put("shopping", context.getString(R.string.category_shopping));
                            dcf.a.put("social", context.getString(R.string.category_social));
                            dcf.a.put("sports", context.getString(R.string.category_sports));
                            dcf.a.put("tools", context.getString(R.string.category_tools));
                            dcf.a.put("travel_and_local", context.getString(R.string.category_travel_and_local));
                            dcf.a.put("video_players_and_editors", context.getString(R.string.category_video_players_and_editors));
                            dcf.a.put("weather", context.getString(R.string.category_weather));
                            dcf.a.put("libraries_and_demo", context.getString(R.string.category_libraries_and_demo));
                            dcf.a.put("arcade_games", context.getString(R.string.category_arcade_games));
                            dcf.a.put("puzzle_games", context.getString(R.string.category_puzzle_games));
                            dcf.a.put("card_games", context.getString(R.string.category_card_games));
                            dcf.a.put("casual_games", context.getString(R.string.category_casual_games));
                            dcf.a.put("racing_games", context.getString(R.string.category_racing_games));
                            dcf.a.put("sport_games", context.getString(R.string.category_sport_games));
                            dcf.a.put("action_games", context.getString(R.string.category_action_games));
                            dcf.a.put("adventure_games", context.getString(R.string.category_adventure_games));
                            dcf.a.put("board_games", context.getString(R.string.category_board_games));
                            dcf.a.put("casino_games", context.getString(R.string.category_casino_games));
                            dcf.a.put("educational_games", context.getString(R.string.category_educational_games));
                            dcf.a.put("music_games", context.getString(R.string.category_music_games));
                            dcf.a.put("role_playing_games", context.getString(R.string.category_role_playing_games));
                            dcf.a.put("simulation_games", context.getString(R.string.category_simulation_games));
                            dcf.a.put("strategy_games", context.getString(R.string.category_strategy_games));
                            dcf.a.put("trivia_games", context.getString(R.string.category_trivia_games));
                            dcf.a.put("word_games", context.getString(R.string.category_word_games));
                            dcf.b = new dcf();
                        }
                    }
                }
                this.a = dcf.b.a(openInputStream);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    String valueOf2 = String.valueOf(this.c.h);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                    sb2.append("Error closing ");
                    sb2.append(valueOf2);
                    Log.e("OemAppPromotions", sb2.toString(), e);
                }
            }
            if (this.a != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(this.c.h);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 14);
            sb3.append("Error opening ");
            sb3.append(valueOf3);
            Log.e("OemAppPromotions", sb3.toString(), e2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            if (!TextUtils.isEmpty(this.a.c)) {
                this.c.i = this.a.c;
            }
            this.c.c.clear();
            this.c.d.clear();
            this.c.e.clear();
            this.c.c.addAll(this.a.a);
            this.c.e.addAll(this.a.a);
            List list = this.c.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.c.d.add(((dby) list.get(i)).k);
            }
            dcc dcc = this.c;
            dcc.a(dcc.e, dbq.a(dcc.g).g());
            List list2 = this.c.j;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((dcb) list2.get(i2)).a(this.c.e);
            }
        }
    }
}
