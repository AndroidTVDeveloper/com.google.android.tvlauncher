package defpackage;

import android.content.ContentValues;
import android.media.tv.TvContract;
import java.util.List;

/* renamed from: dcg  reason: default package */
/* compiled from: PG */
final /* synthetic */ class dcg implements dcj {
    public static final dcj a = new dcg();

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
    public final void a() {
        dck dck = dck.a;
        List list = dck.e.J;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dai dai = (dai) list.get(i);
            if (!dai.g && !dai.f) {
                String str = dai.a;
                String str2 = dai.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("browsable", (Boolean) true);
                dck.d.getContentResolver().update(TvContract.Channels.CONTENT_URI, contentValues, "package_name=? AND system_channel_key=? AND browsable=0", new String[]{str, str2});
            }
        }
    }
}
