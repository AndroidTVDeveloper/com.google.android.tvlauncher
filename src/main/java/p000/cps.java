package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.tvlauncher.R;

/* renamed from: cps */
/* compiled from: PG */
final class cps extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ cpt f6937a;

    public /* synthetic */ cps(cpt cpt) {
        this.f6937a = cpt;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
     arg types: [int, int, int, int, int, int, android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int, int, android.graphics.Shader$TileMode):void}
     arg types: [int, int, float, int, int, android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.RadialGradient.<init>(float, float, float, int, int, android.graphics.Shader$TileMode):void} */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        cpt cpt = this.f6937a;
        BitmapDrawable bitmapDrawable = ((BitmapDrawable[]) objArr)[0];
        int i = cpt.f6940c;
        int i2 = cpt.f6939b;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 540.0f, Color.rgb((int) ((((float) Color.red(i)) * 0.2f) + (((float) Color.red(i2)) * 0.8f)), (int) ((((float) Color.green(i)) * 0.2f) + (((float) Color.green(i2)) * 0.8f)), (int) ((((float) Color.blue(i)) * 0.2f) + (((float) Color.blue(i2)) * 0.8f))), cpt.f6940c, Shader.TileMode.CLAMP);
        if (cpt.f6943f == null) {
            cpt.f6943f = new Paint();
        }
        cpt.f6943f.setShader(linearGradient);
        cpt.f6943f.setDither(true);
        RadialGradient radialGradient = new RadialGradient(960.0f, -300.0f, (float) ((int) Math.sqrt(1627200.0d)), cpt.f6941d, 0, Shader.TileMode.CLAMP);
        if (cpt.f6944g == null) {
            cpt.f6944g = new Paint();
        }
        cpt.f6944g.setShader(radialGradient);
        cpt.f6944g.setDither(true);
        if (cpt.f6945h == null) {
            cpt.f6945h = BitmapFactory.decodeResource(cpt.f6938a.getResources(), R.drawable.home_background_overlay);
            cpt.f6946i = new Paint();
            cpt.f6946i.setShader(new BitmapShader(cpt.f6945h, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        }
        Canvas canvas = new Canvas(bitmapDrawable.getBitmap());
        canvas.drawRect(0.0f, 0.0f, 960.0f, 540.0f, cpt.f6943f);
        canvas.drawRect(0.0f, 0.0f, 960.0f, 540.0f, cpt.f6944g);
        canvas.drawRect(0.0f, 0.0f, 960.0f, 540.0f, cpt.f6946i);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        cpt cpt = this.f6937a;
        cpt.f6947j = null;
        ddd ddd = cpt.f6948k;
        if (ddd.f8329a) {
            Log.w("BackgroundTransition", "animateFadeIn called while the previous animation is still running.");
        }
        ddd.f8330b = SystemClock.uptimeMillis();
        ddd.f8331c = 600;
        ddd.f8329a = true;
        Drawable drawable = ddd.getDrawable(0);
        ddd.setDrawable(0, ddd.getDrawable(1));
        ddd.setDrawable(1, ddd.getDrawable(2));
        ddd.setDrawable(2, drawable);
        ddd.invalidateSelf();
    }
}
