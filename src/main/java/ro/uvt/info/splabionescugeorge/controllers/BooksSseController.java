package ro.uvt.info.splabionescugeorge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.splabionescugeorge.observer.AllBooksSubject;
import ro.uvt.info.splabionescugeorge.observer.SseObserver;

@RestController
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        final SseObserver observer = new SseObserver(emitter);
        allBooksSubject.attach(observer);
        emitter.onCompletion(() -> allBooksSubject.detach(observer));
        emitter.onTimeout(() -> allBooksSubject.detach(observer));
        emitter.onError(e -> allBooksSubject.detach(observer));
        return emitter;
    }
}
