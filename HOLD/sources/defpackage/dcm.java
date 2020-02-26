package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: dcm  reason: default package */
/* compiled from: PG */
final class dcm extends AsyncTask {
    private final dcn a;
    private final Context b;

    public dcm(dcn dcn, Context context) {
        this.a = dcn;
        this.b = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("oem_config", 0);
        int i = sharedPreferences.getInt("content_provider_query_count", 0);
        if (i < 3) {
            if (dcx.a()) {
                sharedPreferences.edit().putInt("content_provider_query_count", i + 1).apply();
            } else {
                sharedPreferences.edit().putInt("content_provider_query_count", i + 1).commit();
            }
            try {
                return this.b.getContentResolver().openInputStream(dem.a);
            } catch (Exception e) {
                String valueOf = String.valueOf(dem.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Error reading ");
                sb.append(valueOf);
                Log.e("OemConfigurationData", sb.toString(), e);
                return null;
            }
        } else {
            String valueOf2 = String.valueOf(dem.a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 68);
            sb2.append("Error reading ");
            sb2.append(valueOf2);
            sb2.append(". Queried the content provider unsuccessfully 3 times.");
            Log.e("OemConfigurationData", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        InputStream inputStream = (InputStream) obj;
        super.onPostExecute(inputStream);
        if (inputStream != null) {
            if (new dco(inputStream, this.a, dhz.a(this.b), dhz.a(this.b, "com.google.android.tv.dynamic_config")).a()) {
                dcn dcn = this.a;
                int i = dcn.R;
                dcn.b();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                String valueOf = String.valueOf(dem.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Error closing ");
                sb.append(valueOf);
                Log.e("OemConfigurationData", sb.toString(), e);
            }
        } else {
            String valueOf2 = String.valueOf(dem.a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
            sb2.append("Error reading ");
            sb2.append(valueOf2);
            Log.e("OemConfigurationData", sb2.toString());
            dcn dcn2 = this.a;
            int i2 = dcn.R;
            dcn2.b();
        }
        dcn dcn3 = this.a;
        int i3 = dcn.R;
        dcn3.a();
    }
}
