package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: dca */
/* compiled from: PG */
final class dca extends AsyncTask {

    /* renamed from: a */
    private dce f8195a;

    /* renamed from: b */
    private final ContentResolver f8196b;

    /* renamed from: c */
    private final /* synthetic */ dcc f8197c;

    public dca(dcc dcc, Context context) {
        this.f8197c = dcc;
        this.f8196b = context.getContentResolver();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        boolean z = false;
        try {
            InputStream openInputStream = this.f8196b.openInputStream(this.f8197c.f8205h);
            if (openInputStream == null) {
                String valueOf = String.valueOf(this.f8197c.f8205h);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Error opening ");
                sb.append(valueOf);
                Log.e("OemAppPromotions", sb.toString());
            } else {
                Context context = this.f8197c.f8204g;
                if (dcf.f8216b == null) {
                    synchronized (dcf.class) {
                        if (dcf.f8216b == null) {
                            dcf.f8215a.put("art_and_design", context.getString(R.string.category_art_and_design));
                            dcf.f8215a.put("auto_and_vehicles", context.getString(R.string.category_auto_and_vehicles));
                            dcf.f8215a.put("beauty", context.getString(R.string.category_beauty));
                            dcf.f8215a.put("books_and_reference", context.getString(R.string.category_books_and_reference));
                            dcf.f8215a.put("business", context.getString(R.string.category_business));
                            dcf.f8215a.put("comics", context.getString(R.string.category_comics));
                            dcf.f8215a.put("communication", context.getString(R.string.category_communication));
                            dcf.f8215a.put("dating", context.getString(R.string.category_dating));
                            dcf.f8215a.put("education", context.getString(R.string.category_education));
                            dcf.f8215a.put("entertainment", context.getString(R.string.category_entertainment));
                            dcf.f8215a.put("events", context.getString(R.string.category_events));
                            dcf.f8215a.put("finance", context.getString(R.string.category_finance));
                            dcf.f8215a.put("food_and_drink", context.getString(R.string.category_food_and_drink));
                            dcf.f8215a.put("health_and_fitness", context.getString(R.string.category_health_and_fitness));
                            dcf.f8215a.put("house_and_home", context.getString(R.string.category_house_and_home));
                            dcf.f8215a.put("lifestyle", context.getString(R.string.category_lifestyle));
                            dcf.f8215a.put("maps_and_navigation", context.getString(R.string.category_maps_and_navigation));
                            dcf.f8215a.put("medical", context.getString(R.string.category_medical));
                            dcf.f8215a.put("music_and_audio", context.getString(R.string.category_music_and_audio));
                            dcf.f8215a.put("news_and_magazines", context.getString(R.string.category_news_and_magazines));
                            dcf.f8215a.put("parenting", context.getString(R.string.category_parenting));
                            dcf.f8215a.put("personalization", context.getString(R.string.category_personalization));
                            dcf.f8215a.put("photography", context.getString(R.string.category_photography));
                            dcf.f8215a.put("productivity", context.getString(R.string.category_productivity));
                            dcf.f8215a.put("shopping", context.getString(R.string.category_shopping));
                            dcf.f8215a.put("social", context.getString(R.string.category_social));
                            dcf.f8215a.put("sports", context.getString(R.string.category_sports));
                            dcf.f8215a.put("tools", context.getString(R.string.category_tools));
                            dcf.f8215a.put("travel_and_local", context.getString(R.string.category_travel_and_local));
                            dcf.f8215a.put("video_players_and_editors", context.getString(R.string.category_video_players_and_editors));
                            dcf.f8215a.put("weather", context.getString(R.string.category_weather));
                            dcf.f8215a.put("libraries_and_demo", context.getString(R.string.category_libraries_and_demo));
                            dcf.f8215a.put("arcade_games", context.getString(R.string.category_arcade_games));
                            dcf.f8215a.put("puzzle_games", context.getString(R.string.category_puzzle_games));
                            dcf.f8215a.put("card_games", context.getString(R.string.category_card_games));
                            dcf.f8215a.put("casual_games", context.getString(R.string.category_casual_games));
                            dcf.f8215a.put("racing_games", context.getString(R.string.category_racing_games));
                            dcf.f8215a.put("sport_games", context.getString(R.string.category_sport_games));
                            dcf.f8215a.put("action_games", context.getString(R.string.category_action_games));
                            dcf.f8215a.put("adventure_games", context.getString(R.string.category_adventure_games));
                            dcf.f8215a.put("board_games", context.getString(R.string.category_board_games));
                            dcf.f8215a.put("casino_games", context.getString(R.string.category_casino_games));
                            dcf.f8215a.put("educational_games", context.getString(R.string.category_educational_games));
                            dcf.f8215a.put("music_games", context.getString(R.string.category_music_games));
                            dcf.f8215a.put("role_playing_games", context.getString(R.string.category_role_playing_games));
                            dcf.f8215a.put("simulation_games", context.getString(R.string.category_simulation_games));
                            dcf.f8215a.put("strategy_games", context.getString(R.string.category_strategy_games));
                            dcf.f8215a.put("trivia_games", context.getString(R.string.category_trivia_games));
                            dcf.f8215a.put("word_games", context.getString(R.string.category_word_games));
                            dcf.f8216b = new dcf();
                        }
                    }
                }
                this.f8195a = dcf.f8216b.mo4089a(openInputStream);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    String valueOf2 = String.valueOf(this.f8197c.f8205h);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                    sb2.append("Error closing ");
                    sb2.append(valueOf2);
                    Log.e("OemAppPromotions", sb2.toString(), e);
                }
            }
            if (this.f8195a != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(this.f8197c.f8205h);
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
            if (!TextUtils.isEmpty(this.f8195a.f8214c)) {
                this.f8197c.f8206i = this.f8195a.f8214c;
            }
            this.f8197c.f8200c.clear();
            this.f8197c.f8201d.clear();
            this.f8197c.f8202e.clear();
            this.f8197c.f8200c.addAll(this.f8195a.f8212a);
            this.f8197c.f8202e.addAll(this.f8195a.f8212a);
            List list = this.f8197c.f8200c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f8197c.f8201d.add(((dby) list.get(i)).f8193k);
            }
            dcc dcc = this.f8197c;
            dcc.m6109a(dcc.f8202e, dbq.m6093a(dcc.f8204g).mo2900g());
            List list2 = this.f8197c.f8207j;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((dcb) list2.get(i2)).mo2852a(this.f8197c.f8202e);
            }
        }
    }
}
