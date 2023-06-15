FROM nginx
WORKDIR /usr/share/nginx/html
RUN mkdir images
COPY /images/puppy.jpeg images/
COPY /my.html .
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]