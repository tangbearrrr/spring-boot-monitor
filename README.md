# spring-boot-monitor

prometheus :
 - $ docker run -d --name=prometheus -p 9090:9090 -v $PWD/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml

grafana :
 - $ docker run -d --name=grafana -p 3000:3000 grafana/grafana
