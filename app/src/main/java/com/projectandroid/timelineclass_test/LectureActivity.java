package com.projectandroid.timelineclass_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class LectureActivity extends AppCompatActivity {

    YouTubePlayerView youTubePlayerView;
    RecyclerView commentRecyclerView;
    LinearLayoutManager layoutManager;
    CommentAdapter commentAdapter;
    String videoId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture);

        youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        commentRecyclerView = findViewById(R.id.commentRecyclerView);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        commentRecyclerView.setLayoutManager(layoutManager);
        commentAdapter = new CommentAdapter();

        commentAdapter.addItem(new Comment("학생1","타임마커","질문내용"));
        commentAdapter.addItem(new Comment("학생2","타임마커","질문내용"));
        commentAdapter.addItem(new Comment("학생3","타임마커","질문내용"));



        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                videoId = "giQE_5yiG_A";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        commentRecyclerView.setAdapter(commentAdapter);
    }
}