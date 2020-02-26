package p000;

import android.content.ContentValues;
import android.media.tv.TvContract;
import java.util.List;

/* renamed from: dcg */
/* compiled from: PG */
final /* synthetic */ class dcg implements dcj {

    /* renamed from: a */
    public static final dcj f8217a = new dcg();

    private dcg() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: a */
    public final void mo2708a() {
        dck dck = dck.f8224a;
        List list = dck.f8228e.f8245J;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dai dai = (dai) list.get(i);
            if (!dai.f8056g && !dai.f8055f) {
                String str = dai.f8050a;
                String str2 = dai.f8051b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("browsable", (Boolean) true);
                dck.f8227d.getContentResolver().update(TvContract.Channels.CONTENT_URI, contentValues, "package_name=? AND system_channel_key=? AND browsable=0", new String[]{str, str2});
            }
        }
    }
}
