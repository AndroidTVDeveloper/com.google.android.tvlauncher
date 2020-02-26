package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.media.tv.TvContract;
import android.media.tv.TvInputManager;
import android.os.AsyncTask;

/* renamed from: ckw  reason: default package */
/* compiled from: PG */
public final class ckw extends AsyncTask {
    private final /* synthetic */ long a;
    private final /* synthetic */ String b;
    private final /* synthetic */ cla c;

    public ckw(cla cla, long j, String str) {
        this.c = cla;
        this.a = j;
        this.b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        Throwable th;
        String str = "preview_audio_uri";
        String str2 = "end_time_utc_millis";
        String str3 = "start_time_utc_millis";
        String str4 = "genre";
        String str5 = "logo_content_description";
        String str6 = "thumbnail_uri";
        cla cla = this.c;
        int i = cla.x;
        ContentResolver contentResolver = cla.a.getContentResolver();
        String str7 = "poster_art_uri";
        String str8 = "content_rating";
        Cursor query = contentResolver.query(TvContract.buildPreviewProgramUri(this.a), null, null, null, null);
        boolean z2 = false;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    z2 = true;
                }
            } catch (Throwable th2) {
                dhr.a(th, th2);
            }
        }
        if (z2) {
            z = z2;
            ContentValues contentValues = new ContentValues();
            String str9 = str7;
            String str10 = "audio_language";
            contentValues.put("package_name", this.b);
            contentValues.put("watch_next_type", (Integer) 3);
            contentValues.put("last_engagement_time_utc_millis", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("title", query.getString(query.getColumnIndex("title")));
            contentValues.put("season_display_number", query.getString(query.getColumnIndex("season_display_number")));
            if (query.getColumnIndex("tv_series_item_type") != -1) {
                contentValues.put("tv_series_item_type", Integer.valueOf(query.getInt(query.getColumnIndex("tv_series_item_type"))));
            }
            contentValues.put("season_title", query.getString(query.getColumnIndex("season_title")));
            contentValues.put("episode_display_number", query.getString(query.getColumnIndex("episode_display_number")));
            contentValues.put("episode_title", query.getString(query.getColumnIndex("episode_title")));
            contentValues.put("canonical_genre", query.getString(query.getColumnIndex("canonical_genre")));
            contentValues.put("short_description", query.getString(query.getColumnIndex("short_description")));
            contentValues.put("long_description", query.getString(query.getColumnIndex("long_description")));
            contentValues.put("video_width", Integer.valueOf(query.getInt(query.getColumnIndex("video_width"))));
            contentValues.put("video_height", Integer.valueOf(query.getInt(query.getColumnIndex("video_height"))));
            String str11 = str10;
            contentValues.put(str11, query.getString(query.getColumnIndex(str11)));
            String str12 = str8;
            contentValues.put(str12, query.getString(query.getColumnIndex(str12)));
            String str13 = str9;
            contentValues.put(str13, query.getString(query.getColumnIndex(str13)));
            String str14 = str6;
            contentValues.put(str14, query.getString(query.getColumnIndex(str14)));
            contentValues.put("searchable", Integer.valueOf(query.getInt(query.getColumnIndex("searchable"))));
            int columnIndex = query.getColumnIndex("internal_provider_data");
            if (query.getType(columnIndex) == 4) {
                contentValues.put("internal_provider_data", query.getBlob(columnIndex));
            }
            contentValues.put("internal_provider_flag1", Integer.valueOf(query.getInt(query.getColumnIndex("internal_provider_flag1"))));
            contentValues.put("internal_provider_flag2", Integer.valueOf(query.getInt(query.getColumnIndex("internal_provider_flag2"))));
            contentValues.put("internal_provider_flag3", Integer.valueOf(query.getInt(query.getColumnIndex("internal_provider_flag3"))));
            contentValues.put("internal_provider_flag4", Integer.valueOf(query.getInt(query.getColumnIndex("internal_provider_flag4"))));
            contentValues.put("version_number", Integer.valueOf(query.getInt(query.getColumnIndex("version_number"))));
            contentValues.put("review_rating_style", Integer.valueOf(query.getInt(query.getColumnIndex("review_rating_style"))));
            contentValues.put("review_rating", query.getString(query.getColumnIndex("review_rating")));
            contentValues.put("type", Integer.valueOf(query.getInt(query.getColumnIndex("type"))));
            contentValues.put("poster_art_aspect_ratio", Integer.valueOf(query.getInt(query.getColumnIndex("poster_art_aspect_ratio"))));
            contentValues.put("poster_thumbnail_aspect_ratio", Integer.valueOf(query.getInt(query.getColumnIndex("poster_thumbnail_aspect_ratio"))));
            contentValues.put("logo_uri", query.getString(query.getColumnIndex("logo_uri")));
            String str15 = str5;
            if (query.getColumnIndex(str15) != -1) {
                contentValues.put(str15, query.getString(query.getColumnIndex(str15)));
            }
            String str16 = str4;
            if (query.getColumnIndex(str16) != -1) {
                contentValues.put(str16, query.getString(query.getColumnIndex(str16)));
            }
            String str17 = str3;
            if (query.getColumnIndex(str17) != -1) {
                contentValues.put(str17, Long.valueOf(query.getLong(query.getColumnIndex(str17))));
            }
            String str18 = str2;
            if (query.getColumnIndex(str18) != -1) {
                contentValues.put(str18, Long.valueOf(query.getLong(query.getColumnIndex(str18))));
            }
            contentValues.put("availability", Integer.valueOf(query.getInt(query.getColumnIndex("availability"))));
            contentValues.put("starting_price", query.getString(query.getColumnIndex("starting_price")));
            contentValues.put("offer_price", query.getString(query.getColumnIndex("offer_price")));
            contentValues.put("release_date", query.getString(query.getColumnIndex("release_date")));
            contentValues.put("item_count", Integer.valueOf(query.getInt(query.getColumnIndex("item_count"))));
            contentValues.put("live", Integer.valueOf(query.getInt(query.getColumnIndex("live"))));
            contentValues.put("internal_provider_id", query.getString(query.getColumnIndex("internal_provider_id")));
            contentValues.put("preview_video_uri", query.getString(query.getColumnIndex("preview_video_uri")));
            String str19 = str;
            if (query.getColumnIndex(str19) != -1) {
                contentValues.put(str19, query.getString(query.getColumnIndex(str19)));
            }
            contentValues.put("last_playback_position_millis", Integer.valueOf(query.getInt(query.getColumnIndex("last_playback_position_millis"))));
            contentValues.put("duration_millis", Integer.valueOf(query.getInt(query.getColumnIndex("duration_millis"))));
            contentValues.put("intent_uri", query.getString(query.getColumnIndex("intent_uri")));
            contentValues.put("transient", Integer.valueOf(query.getInt(query.getColumnIndex("transient"))));
            contentValues.put("interaction_type", Integer.valueOf(query.getInt(query.getColumnIndex("interaction_type"))));
            contentValues.put("interaction_count", Long.valueOf(query.getLong(query.getColumnIndex("interaction_count"))));
            contentValues.put("author", query.getString(query.getColumnIndex("author")));
            contentValues.put("browsable", Integer.valueOf(query.getInt(query.getColumnIndex("browsable"))));
            contentValues.put("content_id", query.getString(query.getColumnIndex("content_id")));
            ((TvInputManager) this.c.a.getSystemService("tv_input")).notifyPreviewProgramAddedToWatchNext(this.b, this.a, ContentUris.parseId(this.c.a.getContentResolver().insert(TvContract.WatchNextPrograms.CONTENT_URI, contentValues)));
        } else {
            z = z2;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (query != null) {
            query.close();
        }
        return valueOf;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            cla cla = this.c;
            int i = cla.x;
            cla.n();
        }
    }
}
