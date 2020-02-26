package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: dcm */
/* compiled from: PG */
final class dcm extends AsyncTask {

    /* renamed from: a */
    private final dcn f8232a;

    /* renamed from: b */
    private final Context f8233b;

    public dcm(dcn dcn, Context context) {
        this.f8232a = dcn;
        this.f8233b = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        SharedPreferences sharedPreferences = this.f8233b.getSharedPreferences("oem_config", 0);
        int i = sharedPreferences.getInt("content_provider_query_count", 0);
        if (i < 3) {
            if (dcx.m6183a()) {
                sharedPreferences.edit().putInt("content_provider_query_count", i + 1).apply();
            } else {
                sharedPreferences.edit().putInt("content_provider_query_count", i + 1).commit();
            }
            try {
                return this.f8233b.getContentResolver().openInputStream(dem.f8381a);
            } catch (Exception e) {
                String valueOf = String.valueOf(dem.f8381a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Error reading ");
                sb.append(valueOf);
                Log.e("OemConfigurationData", sb.toString(), e);
                return null;
            }
        } else {
            String valueOf2 = String.valueOf(dem.f8381a);
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
            if (new dco(inputStream, this.f8232a, dhz.m6481a(this.f8233b), dhz.m6482a(this.f8233b, "com.google.android.tv.dynamic_config")).mo4127a()) {
                dcn dcn = this.f8232a;
                int i = dcn.f8234R;
                dcn.mo4119b();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                String valueOf = String.valueOf(dem.f8381a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Error closing ");
                sb.append(valueOf);
                Log.e("OemConfigurationData", sb.toString(), e);
            }
        } else {
            String valueOf2 = String.valueOf(dem.f8381a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
            sb2.append("Error reading ");
            sb2.append(valueOf2);
            Log.e("OemConfigurationData", sb2.toString());
            dcn dcn2 = this.f8232a;
            int i2 = dcn.f8234R;
            dcn2.mo4119b();
        }
        dcn dcn3 = this.f8232a;
        int i3 = dcn.f8234R;
        dcn3.mo4109a();
    }
}
