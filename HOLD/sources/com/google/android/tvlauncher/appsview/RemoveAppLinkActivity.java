package com.google.android.tvlauncher.appsview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class RemoveAppLinkActivity extends cfu {
    public cfp a;
    private LinearLayout c;
    private TextView d;
    private ImageView e;
    private Button f;
    private Button g;
    private agj h;

    public RemoveAppLinkActivity() {
        super("RemoveAppLinkActivity");
    }

    public final void a() {
        setResult(0);
        finish();
    }

    public final void onBackPressed() {
        a();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = this.b;
        setContentView((int) R.layout.confirmation_dialog);
        this.c = (LinearLayout) findViewById(R.id.dialog_view);
        this.d = (TextView) findViewById(R.id.dialog_message);
        this.e = (ImageView) findViewById(R.id.app_icon);
        this.f = (Button) findViewById(R.id.allow_button);
        this.g = (Button) findViewById(R.id.deny_button);
        ColorDrawable colorDrawable = new ColorDrawable(bg.b(this, R.color.app_banner_background_color));
        this.h = new agj((byte) 0).a(colorDrawable).c(colorDrawable).a(vy.a).a((ub) new dae(getColor(R.color.app_banner_background_color), true));
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.format = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        a(getIntent());
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.a((Activity) this);
    }

    private final void a(Intent intent) {
        String callingPackage = getCallingPackage();
        if (callingPackage != null && dcy.a(this, callingPackage) && intent.hasExtra("EXTRA_APP_LINK_ID") && !intent.getStringExtra("EXTRA_APP_LINK_ID").isEmpty()) {
            String stringExtra = intent.getStringExtra("EXTRA_APP_LINK_ID");
            dby a2 = cim.a(this).a(stringExtra);
            if (a2 == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 29);
                sb.append("The app link with id ");
                sb.append(stringExtra);
                sb.append(" is null");
                Log.e("RemoveAppLinkActivity", sb.toString());
                a();
            } else if (!isFinishing() && !isDestroyed()) {
                this.f.setText((int) R.string.remove);
                this.f.setOnClickListener(new chz(this, a2));
                this.g.setOnClickListener(new cia(this, a2));
                this.d.setText(Html.fromHtml(getResources().getString(R.string.remove_app_link_msg, TextUtils.htmlEncode(a2.a)), 0));
                this.c.setVisibility(0);
                this.f.requestFocus();
                si.a((Activity) this).a(a2.c).b(this.h).a(this.e);
            } else {
                Log.e("RemoveAppLinkActivity", "Activity is no longer running");
            }
        } else {
            Log.e("RemoveAppLinkActivity", "The metadata for uninstalling the app link is invalid");
            a();
        }
    }
}
