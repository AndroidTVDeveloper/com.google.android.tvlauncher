package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: cve  reason: default package */
/* compiled from: PG */
final class cve extends AsyncTask {
    private final Context a;
    private final cvd b;
    private final agj c;

    public cve(Context context, cvd cvd) {
        this.a = context;
        this.b = cvd;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.input_icon_view_size);
        this.c = new agj((byte) 0).a(dimensionPixelSize, dimensionPixelSize).d();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int i;
        Void[] voidArr = (Void[]) objArr;
        Cursor query = this.a.getContentResolver().query(cvf.a, cvh.a, null, null, null);
        if (query == null) {
            try {
                String valueOf = String.valueOf(cvf.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("The cursor for query ");
                sb.append(valueOf);
                sb.append(" is null");
                Log.e("CustomInputsManager", sb.toString());
                return Collections.emptyList();
            } catch (Throwable th) {
                dhr.a(th, th);
            }
        } else {
            ArrayList<cvh> arrayList = new ArrayList<>(20);
            HashMap hashMap = new HashMap(20);
            int i2 = 0;
            while (query.moveToNext()) {
                cvh a2 = cvh.a(this.a, query);
                Intent a3 = cvf.a(a2.b, a2.f);
                if (a3 != null) {
                    a2.g = a3;
                    arrayList.add(a2);
                    hashMap.put(a2.b, a2);
                    int i3 = i2 + 1;
                    a2.n = i2;
                    i2 = i3;
                }
            }
            HashSet hashSet = new HashSet(arrayList.size());
            for (cvh cvh : arrayList) {
                String str = cvh.d;
                if (str == null || !hashMap.containsKey(str)) {
                    i = cvh.n;
                } else {
                    cvh cvh2 = (cvh) hashMap.get(str);
                    hashSet.add(str);
                    cvh.m = cvh2.e;
                    i = cvh2.n;
                }
                cvh.o = i;
            }
            arrayList.removeIf(new cvc(hashSet));
            Collections.sort(arrayList);
            query.close();
            return arrayList;
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        List<cvh> list = (List) obj;
        for (cvh cvh : list) {
            Context context = this.a;
            agj agj = this.c;
            if (cvh.h != null) {
                si.c(context).a(cvh.h).b(agj).b();
            }
            if (cvh.i != null) {
                si.c(context).a(cvh.i).b(agj).b();
            }
            if (cvh.j != null) {
                si.c(context).a(cvh.j).b(agj).b();
            }
            if (cvh.k != null) {
                si.c(context).a(cvh.k).b(agj).b();
            }
        }
        cvf cvf = ((cva) this.b).a;
        cvf.e = list;
        List list2 = cvf.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((cvw) list2.get(i)).e();
        }
        cvf.f = true;
    }
}
