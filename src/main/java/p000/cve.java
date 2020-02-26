package p000;

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

/* renamed from: cve */
/* compiled from: PG */
final class cve extends AsyncTask {

    /* renamed from: a */
    private final Context f7620a;

    /* renamed from: b */
    private final cvd f7621b;

    /* renamed from: c */
    private final agj f7622c;

    public cve(Context context, cvd cvd) {
        this.f7620a = context;
        this.f7621b = cvd;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.input_icon_view_size);
        this.f7622c = new agj((byte) 0).mo192a(dimensionPixelSize, dimensionPixelSize).mo207d();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int i;
        Void[] voidArr = (Void[]) objArr;
        Cursor query = this.f7620a.getContentResolver().query(cvf.f7623a, cvh.f7645a, null, null, null);
        if (query == null) {
            try {
                String valueOf = String.valueOf(cvf.f7623a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("The cursor for query ");
                sb.append(valueOf);
                sb.append(" is null");
                Log.e("CustomInputsManager", sb.toString());
                return Collections.emptyList();
            } catch (Throwable th) {
                dhr.m6455a(th, th);
            }
        } else {
            ArrayList<cvh> arrayList = new ArrayList<>(20);
            HashMap hashMap = new HashMap(20);
            int i2 = 0;
            while (query.moveToNext()) {
                cvh a = cvh.m5729a(this.f7620a, query);
                Intent a2 = cvf.m5710a(a.f7646b, a.f7650f);
                if (a2 != null) {
                    a.f7651g = a2;
                    arrayList.add(a);
                    hashMap.put(a.f7646b, a);
                    int i3 = i2 + 1;
                    a.f7658n = i2;
                    i2 = i3;
                }
            }
            HashSet hashSet = new HashSet(arrayList.size());
            for (cvh cvh : arrayList) {
                String str = cvh.f7648d;
                if (str == null || !hashMap.containsKey(str)) {
                    i = cvh.f7658n;
                } else {
                    cvh cvh2 = (cvh) hashMap.get(str);
                    hashSet.add(str);
                    cvh.f7657m = cvh2.f7649e;
                    i = cvh2.f7658n;
                }
                cvh.f7659o = i;
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
            Context context = this.f7620a;
            agj agj = this.f7622c;
            if (cvh.f7652h != null) {
                C0497si.m8296c(context).mo5942a(cvh.f7652h).mo202b(agj).mo5940b();
            }
            if (cvh.f7653i != null) {
                C0497si.m8296c(context).mo5942a(cvh.f7653i).mo202b(agj).mo5940b();
            }
            if (cvh.f7654j != null) {
                C0497si.m8296c(context).mo5942a(cvh.f7654j).mo202b(agj).mo5940b();
            }
            if (cvh.f7655k != null) {
                C0497si.m8296c(context).mo5942a(cvh.f7655k).mo202b(agj).mo5940b();
            }
        }
        cvf cvf = ((cva) this.f7621b).f7617a;
        cvf.f7627e = list;
        List list2 = cvf.f7626d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((cvw) list2.get(i)).mo3838e();
        }
        cvf.f7628f = true;
    }
}
